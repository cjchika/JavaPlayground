class Phone {
    private int price = 100;
    private String brand = "iPhone";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setBrand("Samsung");
        String ph1 = phone.getBrand();
        System.out.println(ph1);
    }
}
