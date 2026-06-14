package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereo {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/stereotype/stereoconfig.xml");
        //Student student = con.getBean("student", Student.class);
        // OR
        Student student = con.getBean("sant", Student.class);
        Student student2 = con.getBean("sant", Student.class);
        System.out.println(student);
        System.out.println("**********  Printing Standalone hashCode  ***********");
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("*********************");
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
        System.out.println("*********************");
        Teacher t1 = con.getBean("teacher", Teacher.class);
        Teacher t2 = con.getBean("teacher", Teacher.class);
        System.out.println("**********  Printing prototype hashCode  ***********");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println("*********************");

    }
}
