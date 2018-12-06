package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventDetailRequest;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.domain.EventDomain;
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
@RequestMapping(value = "/app/event")
public class AppEventController extends BaseController{

    private static Logger logger = LogManager.getLogger( AppEventController.class );

    @Autowired
    private EventDomain eventDomain;

    @ApiOperation(value = "赛事列表" , notes = "赛事列表" )
    @ApiImplicitParam(name = "eventListRequest" , value = "赛事列表" , required = true , dataType = "EventListRequest" )
    @RequestMapping( value = "/list" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<PageInfo<EventListResponse>> eventList(@RequestBody @Validated final EventListRequest eventListRequest ){
        PageInfo<EventListResponse> result = eventDomain.eventList(eventListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @ApiOperation(value = "赛事详情" , notes = "赛事详情" )
    @ApiImplicitParam(name = "eventDetailRequest" , value = "赛事详情" , required = true , dataType = "EventDetailRequest" )
    @RequestMapping( value = "/eventDetail" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<EventListResponse> eventDetail(@RequestBody @Validated final EventDetailRequest eventDetailRequest ){
        EventListResponse result = eventDomain.eventDetail(eventDetailRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
