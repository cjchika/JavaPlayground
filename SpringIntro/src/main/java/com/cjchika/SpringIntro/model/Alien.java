package com.cjchika.SpringIntro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("90")
    private int age;
    private Computer comp;

    public Computer getComputer() {
        return comp;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.comp = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        comp.compile();
    }
}
