package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// For Reference
//https://www.youtube.com/watch?v=eRKQqHTHqHI&list=PL0zysOflRCekeiERASkpi-crREVensZGS&index=14
public class LifecycleTest {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/Lifecycle/LifecycleConfig.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/Lifecycle/LifecycleConfig.xml");
//      Registering shutdown Hook
        context.registerShutdownHook(); // For Global USe

        System.out.println("******* Using Product File Start *******");
        Product prod1 = (Product) context.getBean("prod1");
        System.out.println(prod1);
        System.out.println("******* Using Product File End *******");

        System.out.println("***************** Using Pepsi File Start ******************");
        Pepsi pep = (Pepsi) context.getBean("pep");
        System.out.println(pep);
        System.out.println("***************** Using Pepsi File End ******************");

        System.out.println("***************** Using Example File Start ******************");
        Example example =(Example) context.getBean("example");
        System.out.println(example);
        System.out.println("***************** Using Example File End ******************");
    }
}
