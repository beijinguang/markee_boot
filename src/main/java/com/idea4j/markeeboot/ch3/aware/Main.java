package com.idea4j.markeeboot.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by markee on 2016/12/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
