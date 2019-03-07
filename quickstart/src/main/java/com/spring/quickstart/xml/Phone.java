package com.spring.quickstart.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
* 采用注解和Lombok开发的phone类
* */
@Component
@Data
public class Phone {
    @Value("iphoneX")
    private String brand;

    @Value("6666.66")
    private double price;
}
