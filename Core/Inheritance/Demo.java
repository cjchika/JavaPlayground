
public class Demo {

  public static void main(String[] args) {
		VeryAdvCalc calc = new VeryAdvCalc();
		int r1 = calc.add(23,43);
		int r2 = calc.sub(34,12);

		int r3 = calc.multi(34,12);
		int r4 = calc.div(34,12);

		double r5 = calc.power(3,5);

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
  }
}