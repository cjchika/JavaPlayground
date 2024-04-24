class Animal
{
	String name;

	public Animal(String name){
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal
{
	String breed;

	public Dog(String name, String breed){
		super(name);
		this.breed = breed;
	}

	public void makeSound(){
		System.out.println("Dog barks!!!");
	}

	public void displayInfo(){
		System.out.println("Name: " + super.name);
		System.out.println("Breed: " + this.breed);
	}
}

public class Demo {

  public static void main(String[] args) {
		Animal animal = new Animal("Goat");
		animal.makeSound();

		Dog dog = new Dog("Champ", "German Shepherd");
		dog.makeSound();
		dog.displayInfo();
  }
}