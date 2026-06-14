package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/spel/spelconfig.xml");
        SpelDemo demo1 = context.getBean("spelDemo", SpelDemo.class);
        System.out.println(demo1);
        System.out.println("***** SpelExpressionParser expression *****");
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("22+44");
        System.out.println(expression.getValue());

    }
}
