package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.order.SubmitOrderRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.order.SubmitOrderResponse;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.OrderDomain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/select")
public class AppOrderController extends BaseController{

    private static Logger logger = LogManager.getLogger( AppOrderController.class );

    @Autowired
    private OrderDomain orderDomain;

    public BaseResponse<SubmitOrderResponse> submitOrder(@RequestBody @Validated final SubmitOrderRequest submitOrderRequest ){

        SubmitOrderResponse result = orderDomain.submitOrder(submitOrderRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
