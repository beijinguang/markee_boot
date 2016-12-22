package com.idea4j.markeeboot.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by markee on 2016/12/22.
 */
@Service
public class DemoService {

    @Value("other class property")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
