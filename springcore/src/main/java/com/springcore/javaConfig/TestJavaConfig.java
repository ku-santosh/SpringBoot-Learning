package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Removing Complete XML for Spring Configuration | @Configuration | @ComponentScan | @Bean Annotation

public class TestJavaConfig {
    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/javaConfig/javaConfigconfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student student = context.getBean("temp", Student.class);

        System.out.println(student);
        student.study();


    }
}
