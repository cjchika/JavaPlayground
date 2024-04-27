package Advance.Interface;

interface Animal {
	void eat();

	void sleep();
}

class Dog implements Animal {
	public void eat() {
		System.out.println("The Dog is eating...");
	}

	public void sleep() {
		System.out.println("The Dog is sleeping...");
	}
}

class Elephant implements Animal {
	public void eat() {
		System.out.println("Eating Elephant!");
	}

	public void sleep() {
		System.out.println("Sleeping Elephant!");
	}
}

public class Demo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Elephant elephant = new Elephant();

		dog.eat();
		dog.sleep();

		elephant.eat();
		elephant.sleep();
	}
}
