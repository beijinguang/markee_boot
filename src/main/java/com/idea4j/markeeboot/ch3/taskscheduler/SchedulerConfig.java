package com.idea4j.markeeboot.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by markee on 2016/12/22.
 */
@Configuration
@ComponentScan("com.idea4j.markeeboot.ch3.taskscheduler")
@EnableScheduling
public class SchedulerConfig {

}
