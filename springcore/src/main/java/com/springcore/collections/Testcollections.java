package com.springcore.collections;

import com.springcore.reference.referenceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcollections {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/collectionConfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");

        System.out.println(emp1.getName());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPhones().getClass().getName());
    }
}
