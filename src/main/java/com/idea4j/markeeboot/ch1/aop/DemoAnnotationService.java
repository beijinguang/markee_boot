package com.idea4j.markeeboot.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by markee on 2016/12/22.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
