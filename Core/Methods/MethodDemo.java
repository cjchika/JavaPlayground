public class MethodDemo {

    static void sayHello(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " yrs old!");
    }

    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int res = add(19, 27);
        System.out.println(res);

        System.out.printf("Sample %d",401);

        double PI = 3.14159;

        System.out.println(PI);
    }
}
