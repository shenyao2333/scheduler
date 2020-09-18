package com.sy.scheduler.config;

import com.sy.scheduler.job.TestTask;
import com.sy.scheduler.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author sy
 * @date: 2020/8/15 14:33
 * @description CommandLineRunner 是一个预加载对象，在SpringBoot启动后就执行
 */
@Component
@Slf4j
public class TaskInit implements CommandLineRunner {


    @Resource
    private QuartzService quartzService;

    /**
     * 这里模拟加入一个定时任务
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        HashMap<String,Object> map = new HashMap<>();
        map.put("name",1);
        quartzService.addJob(TestTask.class, "job", "Test", "0 * * * * ?", map);

    }



}
