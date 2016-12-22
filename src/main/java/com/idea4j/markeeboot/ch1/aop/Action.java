package com.idea4j.markeeboot.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by markee on 2016/12/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
