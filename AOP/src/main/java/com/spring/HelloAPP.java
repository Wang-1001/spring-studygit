package com.spring;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAPP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.hello());
    }


}
