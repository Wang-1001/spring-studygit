package com.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Fighter {
    @Pointcut("execution(* com.spring.Tiger.walk())")
    public void foundTiger() {//里面不可加代码！！！！

    }

    @Before(value = "foundTiger()")
    public void foundBefore() {
        System.out.println("Fighter wait for tiger...");
    }

    @AfterReturning("foundTiger()")
    public void foundAfter() {
        System.out.println("Fighter fight with tiger...");
    }

}
