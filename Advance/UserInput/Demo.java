package Advance.UserInput;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(num * 5);
	}
}
