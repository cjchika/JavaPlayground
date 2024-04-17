class Calc {
	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

	public int multiply(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
}

public class MethodOverload {
	public static void main(String[] args) {
		Calc calc = new Calc();

		int result = calc.multiply(50, 5, 50);

		System.out.println(result);
	}
}
