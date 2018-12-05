package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.banner.*;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.banner.BossBannerListResponse;
import com.mifan.guessing.controller.response.banner.BossGetBannerResponse;
import com.mifan.guessing.domain.BannerDomain;
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
@RequestMapping(value = "/boss/banner")
public class BossBannerController extends BaseController{

    private static Logger logger = LogManager.getLogger( BossBannerController.class );

    @Autowired
    private BannerDomain bannerDomain;

    @RequestMapping( value = "/list" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<PageInfo<BossBannerListResponse>> list(@RequestBody @Validated final BossBannerListRequest bossBannerListRequest ){
        PageInfo<BossBannerListResponse> result = bannerDomain.list(bossBannerListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @RequestMapping( value = "/get" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<BossGetBannerResponse> get(@RequestBody @Validated final BossGetBannerRequest bossGetBannerRequest ){
        BossGetBannerResponse result = bannerDomain.get(bossGetBannerRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @RequestMapping( value = "/del" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<Integer> del(@RequestBody @Validated final BossDeletBannerRequest bossDeletBannerRequest ){
        int result = bannerDomain.del(bossDeletBannerRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @RequestMapping( value = "/edit" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<Integer> edit(@RequestBody @Validated final BossEditBannerRequest bossEditBannerRequest ){
        int result = bannerDomain.edit(bossEditBannerRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @RequestMapping( value = "/add" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<Integer> add(@RequestBody @Validated final BossCreatBannerRequest bossCreatBannerRequest ){
        int result = bannerDomain.insert(bossCreatBannerRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
