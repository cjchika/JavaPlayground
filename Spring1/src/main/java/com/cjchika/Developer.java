package com.cjchika;

public class Developer {

    private int age;
    private Computer com;

    public Developer(){
//        System.out.println("Developer object created!");
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

    public Computer getComp() {
        return com;
    }

    public void setComp(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
