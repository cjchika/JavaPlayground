public class DogTestDrive {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();

        dogOne.setName("Bingo");
        dogOne.setSize(45);

        dogTwo.setName("Wolf");
        dogTwo.setSize(7);

        System.out.println("Dog one: " +  dogOne.getSize());
        System.out.println("Dog Two is: " +  dogTwo.getName());

        dogOne.bark(2);
        dogTwo.bark(3);


    }
}
