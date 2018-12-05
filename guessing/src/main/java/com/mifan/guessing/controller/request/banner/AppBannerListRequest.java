package com.mifan.guessing.controller.request.banner;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
public class AppBannerListRequest {

    @Min( value = 1 , message = "页码必须大于0")
    private int pageNum;

    @Min( value = 1 , message = "条数必须大于0")
    @Max( value = 20 , message = "条数必须小于20")
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
