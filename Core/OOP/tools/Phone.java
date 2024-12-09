package tools;

public  class Phone {
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
