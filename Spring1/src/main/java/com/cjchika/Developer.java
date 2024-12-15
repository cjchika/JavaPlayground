package com.cjchika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Value("60")
    private int age;

    @Autowired
    private Computer com;

    public Developer(){
        System.out.println("Developer object created!");
    }

    public Developer(int age, Computer com){
        this.age = age;
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
