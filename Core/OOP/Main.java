class Phone {
    private int price;
    private String brand;

    public Phone(String brand, int price){
        this.price = price;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


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
