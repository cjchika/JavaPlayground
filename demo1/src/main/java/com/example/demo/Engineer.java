package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

    @Autowired
    Laptop laptop;

    public void code(){
        System.out.println("Coding...");
        System.out.println("!!!");
        laptop.compile();
    }
}
