package com.idea4j.markeeboot.ch1.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by markee on 2016/12/22.
 */
@Configuration
@ComponentScan("com.idea4j.markeeboot.ch1.di")
public class DiConfig {
    @Bean
    public FunctionServiceNoAnnotation functionServiceNoAnnotation(){
        return new FunctionServiceNoAnnotation();
    }

    @Bean
    public UseFunctionServiceNoAnnotation userFunctionServiceNoAnnotation(){
        UseFunctionServiceNoAnnotation useFunctionServiceNoAnnotation = new UseFunctionServiceNoAnnotation();
        useFunctionServiceNoAnnotation.setFunctionServiceNoAnnotation(functionServiceNoAnnotation());
        return useFunctionServiceNoAnnotation;
    }

}
