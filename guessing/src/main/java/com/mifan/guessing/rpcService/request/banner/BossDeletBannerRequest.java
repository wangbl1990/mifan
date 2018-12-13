package com.mifan.guessing.rpcService.request.banner;

import com.sun.tools.javac.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class BossDeletBannerRequest {

    @ApiModelProperty( name = "bannerIds" , value = "bannerId集合" )
    private List<String> bannerIds;

    public List<String> getBannerIds() {
        return bannerIds;
    }

    public void setBannerIds(List<String> bannerIds) {
        this.bannerIds = bannerIds;
    }
}
