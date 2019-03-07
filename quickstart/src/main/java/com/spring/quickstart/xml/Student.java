package com.spring.quickstart.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @Value("Tom")
    private String name;

    @Value("20")
    private int age;

    //使用 注入一个phone类
    @Autowired
    private Phone phone;

}
