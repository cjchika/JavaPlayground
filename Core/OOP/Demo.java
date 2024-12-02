class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }
}

class Computer{
    public void playMusic(){
        System.out.println("Playing...");
    }

    public String getBrand(){
        return "Mac";
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res = calc.add(5,10);

        System.out.println(res);

        Computer comp = new Computer();
        String brand = comp.getBrand();

        System.out.println(brand);
    }



}
