package com.mifan.guessing.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
import com.mifan.guessing.domain.EventDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 赛事预约job
 *
 * @auther wangbinlei
 * @create 2018/12/10
 */
@ElasticSimpleJob(cron = "0 0/5 * * * ?", jobName = "subscribeEventJob")
@Component
public class SubscribeEventJob implements SimpleJob{

    @Autowired
    private EventDomain eventDomain;

    @Override
    public void execute(ShardingContext shardingContext) {
        eventDomain.sendSubscribeMsg();
    }
}
