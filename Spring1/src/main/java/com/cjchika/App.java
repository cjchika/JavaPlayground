package com.cjchika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Developer dev = ctx.getBean("developer", Developer.class);

        System.out.println(dev.getAge());
        dev.code();

    }
}
