import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day, Monday  - Sunday");
        String  day = scanner.nextLine();

        switch(day){
            case "Sunday":
                System.out.println("It's a Sunday!");
                break;
            case "Monday":
                System.out.println("It's a Monday!");
                break;
            case "Tuesday":
                System.out.println("It's a Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's a Mid week!");
                break;
            case "Thursday":
                System.out.println("It's a Thursday!");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            case "Saturday":
                System.out.println("Saturday is here!");
                break;
            default:
                System.out.println("Unrecognized entry!");
        }
    }
}
