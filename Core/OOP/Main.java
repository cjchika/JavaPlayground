import tools.*;


public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 1000);
        Phone phone1 = new Phone("iPhone", 5000);

        String ph1 = phone.getBrand();
        String ph2 = phone1.getBrand();

//        INHERITANCE
        Suv suv = new Suv("Lexus", 2025, 4);

        suv.startEngine();
        suv.stopEngine();
        suv.displaySuvInfo();
    }
}
