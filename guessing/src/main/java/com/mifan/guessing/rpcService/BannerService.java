package com.mifan.guessing.rpcService;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.rpcService.request.banner.*;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.rpcService.response.banner.BossBannerListResponse;
import com.mifan.guessing.rpcService.response.banner.BossGetBannerResponse;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
public interface BannerService {

    public BaseResponse<PageInfo<BossBannerListResponse>> list(BossBannerListRequest request);

    public BaseResponse<Integer> add(BossCreatBannerRequest request);

    public BaseResponse<Integer> del(BossDeletBannerRequest request);

    public BaseResponse<Integer> edit(BossEditBannerRequest request);

    public BaseResponse<BossGetBannerResponse> get(BossGetBannerRequest request);

}
