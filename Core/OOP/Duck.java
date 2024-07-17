public class Duck {
    public static void main(String[] args) {
        Duck d = new Duck(20);
        Duck duck = new Duck();
    }

    int size;

    public Duck(){
        size = 30;
        System.out.println(size);
    }

    public Duck(int duckSize){
        System.out.println("Quack");

        size = duckSize;

        System.out.println("size is " + size);
    }
}
