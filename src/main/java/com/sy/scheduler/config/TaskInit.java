package com.sy.scheduler.config;

import com.sy.scheduler.job.TestTask;
import com.sy.scheduler.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author sy
 * @date: 2020/8/15 14:33
 * @description
 */
@Component
@Slf4j
public class TaskInit implements CommandLineRunner {


    @Autowired
    QuartzService quartzService;

    @Override
    public void run(String... args) throws Exception {
        HashMap<String,Object> map = new HashMap<>();
        map.put("name",1);
        quartzService.addJob(TestTask.class, "job", "Test", "0 * * * * ?", map);

    }



}
