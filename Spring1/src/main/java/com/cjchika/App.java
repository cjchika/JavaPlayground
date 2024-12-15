package com.cjchika;

import com.cjchika.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Developer dev = ctx.getBean("developer", Developer.class);
//        dev.setAge(39);
        System.out.println(dev.getAge());
        dev.code();

        // XML

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//
//        Developer dev = ctx.getBean("developer", Developer.class);
//
//        System.out.println(dev.getAge());
//        dev.code();

    }
}
