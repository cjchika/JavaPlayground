public class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar();

        electricGuitar.setBrand("Yamaha");
        String brandName = electricGuitar.getBrand();

        electricGuitar.setNumOfPickups(10);
        int pickups = electricGuitar.getNumOfPickups();

        electricGuitar.setAfrobeatUsesIt(false);
        boolean useByAfrobeat = electricGuitar.getAfrobeatUsesIt();

        System.out.println(brandName);
        System.out.println(pickups);
        System.out.println(useByAfrobeat);
    }
}
