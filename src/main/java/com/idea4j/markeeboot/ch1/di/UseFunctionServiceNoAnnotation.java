package com.idea4j.markeeboot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by markee on 2016/12/22.
 */
public class UseFunctionServiceNoAnnotation {
    FunctionServiceNoAnnotation functionServiceNoAnnotation;

    public String sayHello(String word) {
        return functionServiceNoAnnotation.sayHello(word);
    }

    public FunctionServiceNoAnnotation getFunctionServiceNoAnnotation() {
        return functionServiceNoAnnotation;
    }

    public void setFunctionServiceNoAnnotation(FunctionServiceNoAnnotation functionServiceNoAnnotation) {
        this.functionServiceNoAnnotation = functionServiceNoAnnotation;
    }
}
