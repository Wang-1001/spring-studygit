package com.spring.quickstart.work;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})

public class MaxTest {
//自動注入max
    @Autowired
    private Max max;

    @Test
    public void getMax() {
        assertEquals(5, max.getMax());
    }
}