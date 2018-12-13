package com.mifan.guessing.rpcService.impl;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.rpcService.OrderService;
import com.mifan.guessing.rpcService.request.order.BossOrderListRequest;
import com.mifan.guessing.rpcService.request.order.BossSettleOrderListRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.rpcService.response.order.BossOrderListResponse;
import com.mifan.guessing.rpcService.response.order.BossSettleOrderListResponse;
import com.mifan.guessing.domain.OrderDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDomain orderDomain;

    @Override
    public BaseResponse<PageInfo<BossOrderListResponse>> orderList(BossOrderListRequest request) {
        PageInfo<BossOrderListResponse> result = orderDomain.orderList(request);
        return BaseResponse.generateOKResponseEntity(result);
    }

    @Override
    public BaseResponse<PageInfo<BossSettleOrderListResponse>> settleList(BossSettleOrderListRequest request) {
        PageInfo<BossSettleOrderListResponse> result = orderDomain.settleOrderList(request);
        return BaseResponse.generateOKResponseEntity(result);
    }
}
