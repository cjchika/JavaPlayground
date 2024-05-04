package org.cjchika;

public class Alien {

    private int age;
    private Computer computer;

    public Alien(){
//        System.out.println("In Alien, Object created!!!");
    }

    public Alien(int age, Computer com){
       this.age = age;
       this.computer = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Called setter");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding...");
        computer.compile();
    }

    public Computer getCom() {
        return computer;
    }

    public void setCom(Computer com) {
        this.computer = com;
    }
}
