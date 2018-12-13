package com.mifan.guessing.rpcService;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.rpcService.request.order.BossOrderListRequest;
import com.mifan.guessing.rpcService.request.order.BossSettleOrderListRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.rpcService.response.order.BossOrderListResponse;
import com.mifan.guessing.rpcService.response.order.BossSettleOrderListResponse;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
public interface OrderService {

    public BaseResponse<PageInfo<BossOrderListResponse>> orderList(BossOrderListRequest request);

    public BaseResponse<PageInfo<BossSettleOrderListResponse>> settleList(BossSettleOrderListRequest request);
}
