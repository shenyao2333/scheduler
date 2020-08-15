package com.sy.scheduler.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author sy
 * @date: 2020/8/15 14:42
 * @description
 */
public class TaskTwo extends QuartzJobBean {



    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("任务二执行");
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        Object name = jobDataMap.get("name");
        System.out.println(name);

    }
}
