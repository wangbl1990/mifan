package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import com.mifan.guessing.manager.RollingBallManager;
import com.mifan.guessing.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class EventDomain {

    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private RollingBallManager rollingBallManager;

    /**
     * 当天难赛事活动列表，默认数据库查询，数据库没有则查询滚球数据，并保存到数据库
     * @param eventListRequest
     * @return
     */
    public PageInfo<EventListResponse> eventList(EventListRequest eventListRequest) {

        EventExample example = new EventExample();
        PageHelper.startPage(eventListRequest.getPageNum(), eventListRequest.getPageSize(),true);
        List<Event> events = eventMapper.selectByExample(example);
        if(null == events){
            rollingBallManager.eventList();
        }
        PageInfo<EventListResponse> repageList = new PageInfo(events);
        List<EventListResponse> eventList = BeanMapper.mapList(events, EventListResponse.class);
        repageList.setList(eventList);
        return repageList;
    }
}
