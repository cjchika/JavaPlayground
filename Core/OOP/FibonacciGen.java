import java.util.Scanner;

public class FibonacciGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        generateFibonacci(num);
    }

    public static void generateFibonacci(int num){
        if(num <= 0){
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1;
        System.out.println("Fibonacci Sequence: ");

        for(int i = 1; i <= num; ++i){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
