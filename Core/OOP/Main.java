import tools.*;

interface A {
    void show();
    void config();
    int add(int a, int b);
}

class B implements A {
    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public void config() {
        System.out.println("Config");
    }

    @Override
    public int add(int i, int j){
        return i + j;
    };
}

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 1000);
        Phone phone1 = new Phone("iPhone", 5000);

        String ph1 = phone.getBrand();
        String ph2 = phone1.getBrand();

//        INHERITANCE
        Suv suv = new Suv("Lexus", 2025, 4);
//        suv.startEngine();
//        suv.stopEngine();
//        suv.displaySuvInfo();

        B b = new B();
        int res = b.add(20, 50);

        System.out.println(res);
    }
}
