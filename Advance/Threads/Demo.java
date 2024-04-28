package Advance.Threads;

class TestA extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
	}
}

class TestB extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b = new TestB();

		a.start();
		b.start();
	}
}
