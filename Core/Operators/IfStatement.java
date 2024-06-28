import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age...");

        int age = scanner.nextInt();

        if(age >= 100){
            System.out.println("Methuselah");
        } else if(age >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Underage");
        }
    }
}
