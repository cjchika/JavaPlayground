class Suv extends Vehicle{
    int doors;

    public Suv(String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");;
    }

    public void displaySuvInfo(){
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}
