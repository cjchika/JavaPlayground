package org.cjchika;
import org.cjchika.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop desk = context.getBean( Desktop.class);
//        desk.compile();
//
//        Desktop desk2 = context.getBean( Desktop.class);
//        desk2.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
