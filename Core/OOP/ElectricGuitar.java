public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean afrobeatUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String theBrand){
        brand = theBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickups(int theNum){
        numOfPickups = theNum;
    }

    boolean getAfrobeatUsesIt(){
        return afrobeatUsesIt;
    }

    void setAfrobeatUsesIt(boolean yesOrNo){
        afrobeatUsesIt = yesOrNo;
    }
}
