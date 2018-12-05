package com.mifan.guessing.controller.request.banner;

import com.sun.tools.javac.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
public class BossDeletBannerRequest {

    private List<String> bannerIds;

    public List<String> getBannerIds() {
        return bannerIds;
    }

    public void setBannerIds(List<String> bannerIds) {
        this.bannerIds = bannerIds;
    }
}
