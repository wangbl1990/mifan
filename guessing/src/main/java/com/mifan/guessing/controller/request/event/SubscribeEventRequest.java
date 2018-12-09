package com.mifan.guessing.controller.request.event;

import com.mifan.guessing.controller.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class SubscribeEventRequest extends BaseRequest{

    @ApiModelProperty( name = "userCode" , value = "用户编码" )
    private String userCode;
    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "eventTime" , value = "赛事开始时间" )
    private Date eventTime;
    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;

    @Override
    public String getUserCode() {
        return userCode;
    }

    @Override
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
