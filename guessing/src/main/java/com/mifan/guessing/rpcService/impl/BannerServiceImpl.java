package com.mifan.guessing.rpcService.impl;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.rpcService.BannerService;
import com.mifan.guessing.rpcService.request.banner.*;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.rpcService.response.banner.BossBannerListResponse;
import com.mifan.guessing.rpcService.response.banner.BossGetBannerResponse;
import com.mifan.guessing.domain.BannerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDomain bannerDomain;

    @Override
    public BaseResponse<PageInfo<BossBannerListResponse>> list(BossBannerListRequest request) {

        PageInfo<BossBannerListResponse> list = bannerDomain.list(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> add(BossCreatBannerRequest request) {
        int list = bannerDomain.insert(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> del(BossDeletBannerRequest request) {
        int list = bannerDomain.del(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> edit(BossEditBannerRequest request) {
        int list = bannerDomain.edit(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<BossGetBannerResponse> get(BossGetBannerRequest request) {
        BossGetBannerResponse list = bannerDomain.get(request);
        return BaseResponse.generateOKResponseEntity(list);
    }
}
