package com.idea4j.markeeboot.ch2.prepost;

/**
 * Created by markee on 2016/12/22.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destory(){
        System.out.println("@Bean-destory-mothod");
    }
}
