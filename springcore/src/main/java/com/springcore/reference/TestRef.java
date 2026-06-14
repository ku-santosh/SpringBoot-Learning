package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/reference/refConfig.xml");
        referenceA temp = (referenceA) context.getBean("refA");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
    }
}

