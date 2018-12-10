package com.mifan.guessing.controller;

import com.mifan.guessing.controller.request.callback.CallbackRequest;
import com.mifan.guessing.controller.request.order.SubmitOrderRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.order.SubmitOrderResponse;
import com.mifan.guessing.dao.model.OrderSettle;
import com.mifan.guessing.domain.OrderDomain;
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
@RequestMapping(value = "/guessing/callback")
public class CallbackController{

    private static Logger logger = LogManager.getLogger( CallbackController.class );

    @Autowired
    private OrderDomain orderDomain;

    @RequestMapping( value = "/callback" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void submitOrder(@RequestBody @Validated final CallbackRequest callbackRequest ){

        //判断推送类型
        if("OrderChangedNotification".equals(callbackRequest.getType())){
            OrderSettle orderSettle = new OrderSettle();
            orderDomain.settle(orderSettle);
        }else if("EventMarketsChangedNotification".equals(callbackRequest.getType())){

        }
    }

}
