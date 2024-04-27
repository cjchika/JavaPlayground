package Advance.Abstract;

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract void makeSound();
}

class Goat extends Animal {

	public Goat(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println(name + " goes Mmmhhhhh!!!!");
	}
}

class Cow extends Animal {
	public Cow(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println(name + " goes Mmmuuuuaaahh!!!");
	}
}

public class Demo {
	public static void main(String[] args) {
		Goat goat = new Goat("Goat");
		Cow cow = new Cow("Cow");

		goat.makeSound();
		cow.makeSound();
	}
}
