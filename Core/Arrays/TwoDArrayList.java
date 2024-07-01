import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Flour");
        bakeryList.add("Margarine");
        bakeryList.add("Sugar");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Yam");
        produceList.add("Coco yam");
        produceList.add("Plantain");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Hennessy");
        drinksList.add("Azul");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        for(ArrayList<String> item : groceryList){
            System.out.println(item);
        }
    }
}
