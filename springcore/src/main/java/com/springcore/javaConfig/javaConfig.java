package com.springcore.javaConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class javaConfig {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }

    @Bean(name = {"student", "temp","anyName"})
    public Student getStudent(){
        // Creating a new student object
        Student student = new Student(getSamosa());
        return student;

    }

}
