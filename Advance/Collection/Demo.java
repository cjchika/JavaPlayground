package Advance.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");

		// for (String fruit : fruits) {
		// System.out.println(fruit);
		// }

		Set<Integer> nums = new HashSet<Integer>();
		nums.add(20);
		nums.add(32);
		nums.add(12);
		nums.add(20);
		nums.add(46);

		// for (int num : nums) {
		// System.out.println(num);
		// }

		Map<String, Integer> students = new HashMap<>();

		students.put("Mark", 83);
		students.put("Stephen", 72);
		students.put("Lynn", 23);

		// for (String key : students.keySet()) {
		// System.out.println(key + " : " + students.get(key));
		// }

		List<Integer> numbs = new ArrayList<>();
		numbs.add(20);
		numbs.add(32);
		numbs.add(12);
		numbs.add(20);
		numbs.add(46);

		Collections.sort(numbs);

		// System.out.println(numbs);
	}
}
