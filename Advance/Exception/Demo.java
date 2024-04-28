package Advance.Exception;

public class Demo {
	public static void main(String[] args) {

		try {
			int res = divide(10, 5);
			System.out.println("Result: " + res);
		} catch (ArithmeticException e) {
			System.out.println("An arithmetic exception occuredL " + e.getMessage());
		}

	}

	public static int divide(int dividend, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return dividend / divisor;
	}
}
