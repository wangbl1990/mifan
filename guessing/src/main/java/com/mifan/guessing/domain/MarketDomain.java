package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.market.MarketListRequest;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.market.MarketListResponse;
import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.mapper.MarketMapper;
import com.mifan.guessing.dao.model.Event;
import com.mifan.guessing.dao.model.EventExample;
import com.mifan.guessing.dao.model.Market;
import com.mifan.guessing.dao.model.MarketExample;
import com.mifan.guessing.manager.RollingBallManager;
import com.mifan.guessing.manager.RollingBallRequestUrl;
import com.mifan.guessing.model.EventMarket;
import com.mifan.guessing.utils.BeanMapper;
import io.swagger.annotations.ApiModel;
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
    @Autowired
    private RollingBallManager rollingBallManager;

    /**
     * 市场列表
     * @param marketListRequest
     * @return
     */
    public List<MarketListResponse> marketList(MarketListRequest marketListRequest) {
        List<EventMarket> eventMarkets = rollingBallManager.eventMarket(marketListRequest.getEnvetId());
        return BeanMapper.mapList(eventMarkets,MarketListResponse.class);
    }
}
