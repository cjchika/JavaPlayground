import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

//        System.out.println("How are you " + name);
        System.out.println(name + " is " + age + " years old, " + "likes " + food + ".");
    }
}
