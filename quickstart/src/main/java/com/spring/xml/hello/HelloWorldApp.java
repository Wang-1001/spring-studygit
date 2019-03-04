package com.spring.xml.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
        //1.读入xml(配置)文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
        //2.读取配置好的bean
        HelloWorld helloWorld =(HelloWorld) context.getBean("helloworld");
        //3.运行helloworld的方法
        System.out.println(helloWorld.getHello());

    }
}
