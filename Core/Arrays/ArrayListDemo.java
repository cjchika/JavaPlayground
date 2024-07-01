import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("Rice");
        foods.add("Beans");
        foods.set(1, "Plantain");

        for(String food : foods){
            System.out.println(food);
        }
    }
}
