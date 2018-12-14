package com.mifan.guessing;

import com.mifan.guessing.controller.request.event.EventListRequest;
import com.mifan.guessing.domain.EventDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @auther wangbinlei
 * @create 2018/12/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={GuessingApplication.class})// 指定启动类
public class EventTest {

    @Autowired
    private EventDomain eventDomain;

    @Test
    public void eventList(){
        EventListRequest request = new EventListRequest();
        request.setPageNum(1);
        request.setPageSize(10);
        request.setEventType("1");
        eventDomain.eventList(request);
    }
}
