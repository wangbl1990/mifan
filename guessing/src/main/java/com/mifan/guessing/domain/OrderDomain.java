package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.Access;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.order.SubmitOrderRequest;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.order.SubmitOrderResponse;
import com.mifan.guessing.dao.mapper.EventMapper;
import com.mifan.guessing.dao.mapper.OrderSettleMapper;
import com.mifan.guessing.dao.mapper.TradeOrderMapper;
import com.mifan.guessing.dao.model.*;
import com.mifan.guessing.exception.GuessingErrorCode;
import com.mifan.guessing.exception.GuessingRunTimeException;
import com.mifan.guessing.manager.RollingBallManager;
import com.mifan.guessing.model.enums.OrderStatus;
import com.mifan.guessing.utils.BeanMapper;
import com.mifan.guessing.utils.IdMakerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tv.zhangyu.rpcservice.UserService;
import tv.zhangyu.rpcservice.base.User;

import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class OrderDomain {

    @Autowired
    private TradeOrderMapper tradeOrderMapper;
    @Autowired
    private RollingBallManager rollingBallManager;
    @Autowired
    private OrderSettleMapper orderSettleMapper;
    @Autowired
    private UserService userService;

    /**
     * 下注
     * @param submitOrderRequest
     * @return
     */
    public SubmitOrderResponse submitOrder(SubmitOrderRequest submitOrderRequest) {
        //校验用户信息
        User user = userService.getUserByUserId(submitOrderRequest.getUserCode());
        //落单
        TradeOrder tradeOrder = new TradeOrder();
        tradeOrder.setEventId(submitOrderRequest.getEventId());
        tradeOrder.setEventName(submitOrderRequest.getEventName());
        tradeOrder.setEventType(submitOrderRequest.getEventType());
        tradeOrder.setId(IdMakerUtils.getOrderId());
        tradeOrder.setMarketId(submitOrderRequest.getMarketId());
        tradeOrder.setOrderId(tradeOrder.getOrderId());
        tradeOrder.setRequestAmount(submitOrderRequest.getRequestAmount());
        tradeOrder.setRequestPrice(submitOrderRequest.getRequestPrice());
        tradeOrder.setSelectionId(submitOrderRequest.getSelectionId());
        tradeOrder.setSubmittedTime(new Date());
        tradeOrder.setStatus(OrderStatus.INIT.getCode());
        tradeOrder.setUserCode(submitOrderRequest.getUserCode());
        tradeOrder.setUserName(user.getNickname());
        tradeOrderMapper.insert(tradeOrder);
        //冻结用户下单米粒

        //请求滚球下单
        SubmitOrderResponse response = null;
        try {
            TradeOrder order = rollingBallManager.order(tradeOrder, submitOrderRequest);
            response = BeanMapper.map(order,SubmitOrderResponse.class);
        }catch (Exception e){
            //解冻用户米粒

            //更新订单状态投注失败
            TradeOrder updateOrder = new TradeOrder();
            updateOrder.setId(tradeOrder.getId());
            updateOrder.setStatus(OrderStatus.FAIL.getCode());
            tradeOrderMapper.updateByPrimaryKey(updateOrder);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }

        return response;

    }

    /**
     * 结算
     * @param orderSettle
     */
    public void settle(OrderSettle orderSettle){

        //跟新原订单已结算
        TradeOrderExample tradeOrderExample = new TradeOrderExample();
        tradeOrderExample.createCriteria().andIdEqualTo(orderSettle.getOrderId()).andStatusEqualTo(OrderStatus.PAYED.getCode());

        TradeOrder tradeOrder = new TradeOrder();
        tradeOrder.setStatus(OrderStatus.SETTLED.getCode());
        int result = tradeOrderMapper.updateByExampleSelective(tradeOrder, tradeOrderExample);
        if(1 == result){
            //新增结算单
            orderSettle.setCreateTime(new Date());
            orderSettle.setId(IdMakerUtils.getOrderId());
            orderSettleMapper.insertSelective(orderSettle);

            //根据结算盈亏增加或者扣减用户米粒值

        }
    }
}
