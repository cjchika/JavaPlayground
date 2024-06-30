import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        String[][] cars = {
                {"BMW", "Prado", "Lexus"},
                {"Camaro", "Mustang", "Tesla"},
                {"Lambo", "Ferrari", "Mercedes"}
        };

        for(String[] car : cars){
           for(String c : car){
               System.out.println(c);
           }
        }

    }
}
