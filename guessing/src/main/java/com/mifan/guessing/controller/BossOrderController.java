package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.order.BossOrderListRequest;
import com.mifan.guessing.controller.request.order.BossSettleOrderListRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.order.BossOrderListResponse;
import com.mifan.guessing.controller.response.order.BossSettleOrderListResponse;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.OrderDomain;
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
@RequestMapping(value = "/boss/order")
public class BossOrderController extends BaseController{

    private static Logger logger = LogManager.getLogger( BossOrderController.class );

    @Autowired
    private OrderDomain orderDomain;

    @RequestMapping( value = "/orderList" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<BossOrderListResponse> orderList(@RequestBody @Validated final BossOrderListRequest bossOrderListRequest ){

        PageInfo<BossOrderListResponse> result = orderDomain.orderList(bossOrderListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @RequestMapping( value = "/settleOrderList" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<BossSettleOrderListResponse> settleOrderList(@RequestBody @Validated final BossSettleOrderListRequest bossSettleOrderListRequest ){

        PageInfo<BossSettleOrderListResponse> result = orderDomain.settleOrderList(bossSettleOrderListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
