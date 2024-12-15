package com.cjchika.config;

import com.cjchika.Computer;
import com.cjchika.Desktop;
import com.cjchika.Developer;
import com.cjchika.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.cjchika")
public class AppConfig {
//
//    @Bean
//    public Developer developer(@Qualifier("desktop") Computer com){
//        Developer dev = new Developer();
//        dev.setAge(90);
//        dev.setCom(com);
//        return dev;
//
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
