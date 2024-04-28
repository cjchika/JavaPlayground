package Advance.Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Test {
	void display(String so);
}

@FunctionalInterface
interface Arith {
	int add(int a, int b);
}

public class Demo {
	public static void main(String[] args) {

		Test test = (so) -> System.out.println("In Display!!!" + so);
		test.display("CJ");

		Arith arith = (num1, num2) -> num1 + num2;
		int theSum = arith.add(5, 20);

		System.out.println(theSum);

		Runnable r = () -> System.out.println("Hello from Runnable");
		r.run();

		Function<Integer, Integer> doubleNumber = x -> x * 2;
		System.out.println(doubleNumber.apply(5));

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(5, 5));

		Predicate<Integer> isEven = n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(isEven.test(8));

		Function<String, String> toUpperCase = String::toUpperCase;
		System.out.println(toUpperCase.apply("sharp"));
	}
}
