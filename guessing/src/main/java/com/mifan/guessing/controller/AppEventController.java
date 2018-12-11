package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.Access;
import com.mifan.guessing.controller.request.event.EventDetailRequest;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.event.SubscribeEventRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.event.EventTypeResponse;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.model.enums.EventType;
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

import java.util.ArrayList;
import java.util.List;

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

    @ApiOperation(value = "赛事分类" , notes = "赛事分类" )
    @RequestMapping( value = "/eventType" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<List<String>> eventType(){
        List<String> eventList = new ArrayList<String>();
        for(EventType eventType:EventType.values()){
            eventList.add(eventType.getCode());
        }
        return BaseResponse.generateOKResponseEntity(eventList);
    }

    @ApiOperation(value = "预约赛事" , notes = "预约赛事" )
    @ApiImplicitParam(name = "subscribeEventRequest" , value = "预约赛事" , required = true , dataType = "SubscribeEventRequest" )
    @RequestMapping( value = "/subscribeEvent" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Access
    public BaseResponse<Integer> subscribeEvent(@RequestBody @Validated final SubscribeEventRequest subscribeEventRequest ){
        Integer result = eventDomain.subscribeEvent(subscribeEventRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }



}
