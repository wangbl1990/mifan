package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.Access;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.event.SubscribeEventRequest;
import com.mifan.guessing.controller.request.order.SubmitOrderRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.order.SubmitOrderResponse;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.OrderDomain;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/select")
public class AppOrderController extends BaseController{

    private static Logger logger = LogManager.getLogger( AppOrderController.class );

    @Autowired
    private OrderDomain orderDomain;

    @ApiOperation(value = "下注" , notes = "下注" )
    @ApiImplicitParam(name = "submitOrderRequest" , value = "下注" , required = true , dataType = "SubmitOrderRequest" )
    @RequestMapping( value = "/submitOrder" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<SubmitOrderResponse> submitOrder(@RequestBody @Validated final SubmitOrderRequest submitOrderRequest ){
        SubmitOrderResponse result = orderDomain.submitOrder(submitOrderRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
