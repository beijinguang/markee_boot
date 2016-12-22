package com.idea4j.markeeboot.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by markee on 2016/12/22.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每5秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 47 15 ? * *")
    public void fixTimeExecution(){
        System.out.println("指定时间"+dateFormat.format(new Date())+"执行");
    }

}
