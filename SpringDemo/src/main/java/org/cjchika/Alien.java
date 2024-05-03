package org.cjchika;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien(){
        System.out.println("In Alien, Object created!!!");
    }

    public Alien(int age, Laptop laptop){
       this.age = age;
       this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Called setter");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding...");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
