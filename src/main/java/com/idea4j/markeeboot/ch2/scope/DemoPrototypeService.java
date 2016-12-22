package com.idea4j.markeeboot.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by markee on 2016/12/22.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
