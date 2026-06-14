package org.spring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! My Program Started............" );
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //Insert query
        String query = "insert into student(id, name, city) values(?, ?, ?)";

        // Fire Query
        int result = template.update(query, 456, "Binod Kumar", "Panjab");
        System.out.println("Number of record inserted...." + result);
    }
}
