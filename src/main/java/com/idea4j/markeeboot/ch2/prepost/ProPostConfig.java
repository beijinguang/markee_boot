package com.idea4j.markeeboot.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by markee on 2016/12/22.
 */
@Configuration
@ComponentScan("com.idea4j.markeeboot.ch2.prepost")
public class ProPostConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
