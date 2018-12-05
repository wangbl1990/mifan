package com.mifan.guessing.manager;

import com.mifan.guessing.dao.model.Event;
import java.util.List;

import com.mifan.guessing.model.EventMarket;
import com.mifan.guessing.model.TradeOrder;
import com.mifan.guessing.utils.DateUtils;
import org.apache.tomcat.util.security.MD5Encoder;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 滚球接口
 * @auther wangbinlei
 * @create 2018/12/5
 */
public class RollingBallManager {

    private static final String vendorIdKey = "vendor_id=";

    private static final String vendorAppAIdKey = "vendor_app_id=";

    private static final String requestTimeKey = "request_time=";

    private static final String requestSgin = "request_sgin=";

    private String vendorIdValue;

    private String vendorAppIdValue;

    private String secretKey;


    private String sign(){
        StringBuffer stringBuffer = new StringBuffer();
        long unixTimeStamp = DateUtils.getUnixDate();
        stringBuffer.append(vendorIdKey).append(vendorIdValue).append("&").append(vendorAppAIdKey).append(vendorAppIdValue)
                .append("&").append(requestTimeKey).append(unixTimeStamp).append("&").append(secretKey);
        String encode = MD5Encoder.encode(stringBuffer.toString().getBytes());
        return encode;
    }

    /**
     * 赛事列表查询
     * @return
     */
    public List<Event> eventList(){
        return null;
    }

    /**
     * 赛事详情查询
     * @return
     */
    public Event eventInfo(){
        return null;
    }

    /**
     * 赛事行情查询
     * @return
     */
    public EventMarket eventMarket(){
        return null;
    }

    /**
     * 下单
     */
    public void order(){

    }

    /**
     * 取消订单
     */
    public void cancleOrder(){

    }

    /**
     * 订单详情
     * @return
     */
    public TradeOrder orderDetail(){

        return new TradeOrder();
    }

    /**
     * 订单列表
     * @return
     */
    public List<TradeOrder> orderList(){

        return null;
    }

    /**
     * 订阅赛事变化通知
     */
    public void subscribeEvent(){

    }

    /**
     * 取消订阅赛事变化通知
     */
    public void unSubscribeEvent(){

    }


}
