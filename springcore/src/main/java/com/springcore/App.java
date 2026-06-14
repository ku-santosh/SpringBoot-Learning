package com.springcore;

import com.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/config.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("**************** collections ****************");
        ApplicationContext contextEmp = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/collectionConfig.xml");
        Emp emp1 = (Emp) contextEmp.getBean("emp1");
        System.out.println(emp1);

    }

}
