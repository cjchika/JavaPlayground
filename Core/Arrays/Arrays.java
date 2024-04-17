
class DemoArray {
	public static void main(String[] args) {
		// int nums[] = { 10, 20, 30 };

		// int dynamicNum[] = new int[5];

		// dynamicNum[0] = 40;
		// dynamicNum[1] = 50;
		// dynamicNum[2] = 60;
		// dynamicNum[3] = 70;
		// dynamicNum[4] = 80;

		// for (int i = 0; i < nums.length; i++) {
		// System.out.println(nums[i]);
		// }

		// for (int i = 0; i < dynamicNum.length; i++) {
		// System.out.println(dynamicNum[i]);
		// }

		int numbs[][] = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				numbs[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numbs[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Break");

		for (int n[] : numbs) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}