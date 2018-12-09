package com.mifan.guessing.controller;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.controller.request.market.MarketListRequest;
import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.controller.response.event.EventListResponse;
import com.mifan.guessing.controller.response.market.MarketListResponse;
import com.mifan.guessing.domain.EventDomain;
import com.mifan.guessing.domain.MarketDomain;
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

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@RestController
@RequestMapping(value = "/app/market")
public class AppMarketController extends BaseController{

    private static Logger logger = LogManager.getLogger( AppMarketController.class );

    @Autowired
    private MarketDomain marketDomain;

    @ApiOperation(value = "市场列表" , notes = "市场列表" )
    @ApiImplicitParam(name = "marketListRequest" , value = "市场列表" , required = true , dataType = "MarketListRequest" )
    @RequestMapping( value = "/marketList" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResponse<List<MarketListResponse>> marketList(@RequestBody @Validated final MarketListRequest marketListRequest ){
        List<MarketListResponse> result = marketDomain.marketList(marketListRequest);
        return BaseResponse.generateOKResponseEntity(result);
    }

}
