package com.idea4j.markeeboot.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by markee on 2016/12/22.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev bean");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("prod bean");
    }
}

