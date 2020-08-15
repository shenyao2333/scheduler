package com.sy.scheduler.controller;

import com.sy.scheduler.job.TaskTwo;
import com.sy.scheduler.service.QuartzService;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author sy
 * @date: 2020/8/15 14:35
 * @description
 */
@RestController
public class MainController {

    @Resource
    private QuartzService quartzService;

    @GetMapping("/test1")
    public void test(){
        quartzService.runAJobNow("job","Job");
    }

    @GetMapping("/test2")
    public void test2(String name){
        quartzService.runAJobNow(name,"Test");
    }

    @GetMapping("/add")
    public void add(){
        quartzService.addJob(TaskTwo.class,  "test2","Test","0/5 * * * * ?" , null);
    }



}
