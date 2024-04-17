class Calculator {
	int a;

	public int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
}

class DemoClass {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		calc.add(50, 5);
	}
}