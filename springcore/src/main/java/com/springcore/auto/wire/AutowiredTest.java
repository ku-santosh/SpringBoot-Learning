package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/auto/wire/autoconfig.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

    }
}
