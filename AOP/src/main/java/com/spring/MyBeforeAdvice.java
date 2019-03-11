package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* 用户自定义前置增强类
* */
public class MyBeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforeMethod(){
        logger.debug("This is a before method...");
       /* System.out.println("This is a before method");*/
    }
}
