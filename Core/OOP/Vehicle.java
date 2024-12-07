
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void  startEngine(){
        System.out.println("The engine is starting...");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping...");
    }

    public void displayInfo(){
        System.out.println("Vehicle: " + brand + ", Year: " + year);
    }
}