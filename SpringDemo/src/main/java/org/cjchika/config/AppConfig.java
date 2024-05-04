package org.cjchika.config;

import org.cjchika.Alien;
import org.cjchika.Computer;
import org.cjchika.Desktop;
import org.cjchika.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(Computer com){ //@Qualifier("laptop")
        Alien obj = new Alien();
        obj.setAge(100);
        obj.setCom(com);
        return obj;
    }

//    @Bean(name = "com2")
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
