package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.banner.*;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.banner.AppBannerListResponse;
import com.mifan.guessing.controller.response.banner.BossBannerListResponse;
import com.mifan.guessing.controller.response.banner.BossGetBannerResponse;
import com.mifan.guessing.domain.BannerDomain;
import io.swagger.annotations.Api;
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
@RequestMapping(value = "/app/banner")
@Api(description = "APPBanner")
public class AppBannerController extends BaseController{

    private static Logger logger = LogManager.getLogger( AppBannerController.class );

    @Autowired
    private BannerDomain bannerDomain;

    @ApiOperation(value = "banner列表" , notes = "banner列表" )
    @ApiImplicitParam(name = "appBannerListRequest" , value = "banner列表" , required = true , dataType = "AppBannerListRequest" )
    @RequestMapping( value = "/list" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<PageInfo<AppBannerListResponse>> list(@RequestBody @Validated final AppBannerListRequest appBannerListRequest ){
        PageInfo<AppBannerListResponse> result = bannerDomain.listForApp(appBannerListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }
}
