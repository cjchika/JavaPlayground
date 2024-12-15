package com.cjchika;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop obj created!");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop...");
    }
}
