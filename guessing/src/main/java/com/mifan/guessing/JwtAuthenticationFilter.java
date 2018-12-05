package com.mifan.guessing;

import com.mifan.guessing.utils.IpUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private static final Logger logger = LogManager.getLogger( JwtAuthenticationFilter.class );

    @Autowired
    private PathMatcher pathMatcher ;
    private final static String MDC_KEY_CLI_IP = "cliIp";
    private static String MDC_KEY_USER_NAME = "userName";
    private static String MDC_KEY_REQ_ID = "reqId";
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ServletRequest requestWrapper = null;
        String beforereqId = request.getHeader( MDC_KEY_REQ_ID ) ;
        String befouserName = request.getHeader( MDC_KEY_USER_NAME ) ;
        String beforecliIp = request.getHeader( MDC_KEY_CLI_IP ) ;
        String userId = null ;
        try {
            String token = request.getHeader("token");
            //检查jwt令牌, 如果令牌不合法或者过期, 里面会直接抛出异常, 下面的catch部分会直接返回
            if(!StringUtils.isNotBlank( token )) {

            }

            if (request instanceof HttpServletRequest) {
                requestWrapper = new RequestWrapper((HttpServletRequest) request);
            }
        } catch (Exception e) {
//            request.setAttribute("userId", null );
            if (request instanceof HttpServletRequest) {
                requestWrapper = new RequestWrapper((HttpServletRequest) request);
            }
        }
        HttpServletResponse resp = (HttpServletResponse) response;
        ResponseWrapper responseWrapper = new ResponseWrapper(resp); // 包装响应对象 resp 并缓存响应数据
        long start = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString() ;
        StringBuilder strBuilder = new StringBuilder();
        request.setAttribute("userId", userId);
        ThreadContext.put(MDC_KEY_USER_NAME, contact(userId ,befouserName ) );
        strBuilder = new StringBuilder();
        ThreadContext.put(MDC_KEY_REQ_ID, contact(uuid ,beforereqId ) );
        strBuilder = new StringBuilder();
        ThreadContext.put(MDC_KEY_CLI_IP, contact( IpUtil.getIpAddr( request )  ,beforecliIp ) );
        if (null == requestWrapper) {
            //如果jwt令牌通过了检测, 那么就把request传递给后面的RESTful api
            filterChain.doFilter(request, response);
            logger.info( System.currentTimeMillis()- start + " requestUrl:  end  " + request.getRequestURL().toString() );
        } else {
            filterChain.doFilter(requestWrapper, responseWrapper);
            byte[] bytes = responseWrapper.getBytes(); // 获取缓存的响应数据
            resp.getOutputStream().write( bytes ); // 将压缩数据响应给客户端
            logger.info( System.currentTimeMillis()- start + " requestUrl: end " + request.getRequestURL().toString() + "响应保文：" + new String(bytes,"utf-8") );
        }
    }


    private String contact(String ... str){
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : str){
            stringBuilder.append( StringUtils.trimToEmpty(s) ).append( "|");
        }
        return stringBuilder.toString();
    }
}