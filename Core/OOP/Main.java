public class Main {
    public static void main(String[] args) {
//        Human human = new Human("Bro", 28, 75);
//        Human human2 = new Human("Sis", 25, 65);
//
//        System.out.println(human.name);
//        System.out.println(human2.name);
//
//        human.drink();
//        human2.eat();

//        Cake cake = new Cake("The Flour", "The Sauce", "The Sugar");
//
//        System.out.println(cake.sugar);
//        ----

//        if(x < 8) myDog.bark(4);
//
//        while(x > 4){
//            myDog.play();
//        }

//        int[] numList = {10,8,6,4};
//        System.out.println("Hello");
//        System.out.println("Dog: " + name);
//        String num = "10";
//        int converted = Integer.parseInt(num);
//
//        System.out.println(converted);

//        int a = 1;
//        System.out.println("Before the Loop");
//        while(a < 4){
//            System.out.println("In the loop");
//            System.out.println("Value of x is " + a);
//            a = a + 1;
//        }
//        System.out.println("After the Loop.");

//        -----

//        int beerNum = 99;
//        String word = "bottles";
//
//        while(beerNum > 0){
//            if(beerNum == 1){
//                word = "bottle";
//            }
//
//            System.out.println(beerNum + " " + word + " of beer on the wall");
//            System.out.println(beerNum + " " + word + " of beer.");
//            System.out.println("Take one down.");
//            System.out.println("Pass it around");
//            beerNum = beerNum - 1;
//
//            if(beerNum == 0) {
//                System.out.println("No more bottles of beer on the wall");
//            }
//        }

//        -----

//        Dog myDog = new Dog();
//        myDog.age = 10;
//        myDog.name = "Champion";
//        myDog.breed = "German Shepherd";
//
//        myDog.bark();

        Dog[] pets;

        pets = new Dog[3];

        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();

        pets[0].name = "Tiger";
//        pets[0].breed = "Ekuke";

        pets[1].name = "Champion";
//        pets[1].breed = "German Shepherd";

        pets[2].name = "Rough";
//        pets[2].breed = "Dangerous";

        for(int i = 0; i < pets.length; i++){
            pets[i].bark(3);
        }

    }
}
