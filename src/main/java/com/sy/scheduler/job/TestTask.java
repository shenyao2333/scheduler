package com.sy.scheduler.job;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author sy
 * @date: 2020/8/14 18:11
 * @description 创建一个定时任务。
 */
@Slf4j
public class TestTask   extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // 获取参数
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();

        String name = jobDataMap.get("name").toString();
        System.out.println(name);

        System.out.println("任务信息："+JSON.toJSONString(jobExecutionContext.getTrigger()));

    }
}
