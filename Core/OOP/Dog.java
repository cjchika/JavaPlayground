public class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void bark(int num){
        for(int i = 1; i<=num;i++){
            System.out.println("The Dog barks!");
        }
    }

    void play(){
        System.out.println("Playing dog...");
    }
}
