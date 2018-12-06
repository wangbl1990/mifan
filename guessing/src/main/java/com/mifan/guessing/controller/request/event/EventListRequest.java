package com.mifan.guessing.controller.request.event;

import com.mifan.guessing.controller.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class EventListRequest extends BaseRequest{

    @ApiModelProperty( name = "pageNum" , value = "页码" )
    @Min( value = 1 , message = "页码必须大于0")
    private int pageNum;

    @ApiModelProperty( name = "pageSize" , value = "条数" )
    @Min( value = 1 , message = "条数必须大于0")
    @Max( value = 20 , message = "条数必须小于20")
    private int pageSize;

    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;//赛事类型

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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
