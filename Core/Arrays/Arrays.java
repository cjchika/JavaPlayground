
class DemoArray {
	public static void main(String[] args) {

//		String[] cars = {"Camaro", "Mustang"};
//		cars[0] = "Tesla";

		String[] cars = new String[3];

		cars[0] = "Mustang";
		cars[1] = "Tesla";
		cars[2] = "Camaro";

		for(String car : cars){
			System.out.println(car);
		}

//		System.out.println(cars[0]);
	}
}