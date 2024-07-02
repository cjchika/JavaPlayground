public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2020;
    String color = "White";
    double price = 30000.00;

    void drive(){
        System.out.println("You're driving this car!");
    }

    void brake(){
        System.out.println("You matched on the car's break!");
    }

    public String toString(){
        return make + "\n" +model+"\n"+color+"\n"+year;
    }
}
