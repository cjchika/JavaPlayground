package com.cjchika;

public class Developer {

    private int age;
    private Laptop laptop;

    public Developer(){
        System.out.println("Developer object created!");
    }

    public Developer(int age, Laptop laptop){
        this.age = age;
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Coding...");
    }
}
