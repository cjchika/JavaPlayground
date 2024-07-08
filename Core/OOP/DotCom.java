import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public ArrayList<String> getLocationCells(){
        return locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String checkYourself(String userGuess){
        String  result = "miss";
        int index = locationCells.indexOf(userGuess);

        if(index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " +  name + "    :  ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
