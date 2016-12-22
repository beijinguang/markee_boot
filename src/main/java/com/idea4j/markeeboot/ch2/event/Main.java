package com.idea4j.markeeboot.ch2.event;

import com.idea4j.markeeboot.ch2.profile.DemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by markee on 2016/12/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
