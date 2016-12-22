package com.idea4j.markeeboot.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by markee on 2016/12/22.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
