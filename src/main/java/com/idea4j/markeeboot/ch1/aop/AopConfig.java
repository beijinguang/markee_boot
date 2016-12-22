package com.idea4j.markeeboot.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by markee on 2016/12/22.
 */
@Configuration
@ComponentScan("com.idea4j.markeeboot.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
