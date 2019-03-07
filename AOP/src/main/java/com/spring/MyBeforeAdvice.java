package com.spring;
/*
* 用户自定义前置增强类
* */
public class MyBeforeAdvice {
    public void beforeMethod(){
        System.out.println("This is a before method");
    }
}
