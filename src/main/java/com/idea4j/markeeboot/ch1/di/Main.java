package com.idea4j.markeeboot.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by markee on 2016/12/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        UseFunctionServiceNoAnnotation useFunctionServiceNoAnnotation = context.getBean(UseFunctionServiceNoAnnotation.class);
        System.out.println(useFunctionService.sayHello("springboot"));
        System.out.println(useFunctionServiceNoAnnotation.sayHello("hha"));
        context.close();
    }

}
