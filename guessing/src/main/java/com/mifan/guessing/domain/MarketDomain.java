package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.mapper.MarketMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import com.mifan.guessing.dao.model.Market;
import com.mifan.guessing.dao.model.MarketExample;
import com.mifan.guessing.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class MarketDomain {

    @Autowired
    private MarketMapper marketMapper;

    /**
     * 市场列表
     * @param eventListRequest
     * @return
     */
    public PageInfo<EventListResponse> marketList(EventListRequest eventListRequest) {

        MarketExample example = new MarketExample();
        PageHelper.startPage(eventListRequest.getPageNum(), eventListRequest.getPageSize(),true);
        List<Market> events = marketMapper.selectByExample(example);
        PageInfo<EventListResponse> repageList = new PageInfo(events);
        List<EventListResponse> eventList = BeanMapper.mapList(events, EventListResponse.class);
        repageList.setList(eventList);
        return repageList;
    }
}
