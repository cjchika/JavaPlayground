package com.cjchika;

public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop...");
    }
}
