            package com.spring.quickstart.work;

            import org.springframework.context.ApplicationContext;
            import org.springframework.context.support.ClassPathXmlApplicationContext;

            public class MaxAPP {
                public static void main(String[] args) {
                    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
                    Max max = context.getBean(Max.class);
                    System.out.println(max.getMax());
                }
            }
