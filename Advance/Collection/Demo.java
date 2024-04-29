package Advance.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		Set<Integer> nums = new HashSet<Integer>();
		nums.add(20);
		nums.add(32);
		nums.add(12);
		nums.add(20);
		nums.add(46);

		for (int num : nums) {
			System.out.println(num);
		}

		Map<String, Integer> students = new HashMap<>();

		students.put("Mark", 83);
		students.put("Stephen", 72);
		students.put("Lynn", 23);

		for (String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key));
		}

		List<Integer> numbs = new ArrayList<>();
		numbs.add(20);
		numbs.add(32);
		numbs.add(12);
		numbs.add(20);
		numbs.add(46);

		Collections.sort(numbs);

		List<Integer> nrs = Arrays.asList(4, 2, 5, 1, 2, 9, 8);

		Stream<Integer> ss1 = nrs.stream();
		Stream<Integer> ss2 = ss1.filter(m -> m % 2 == 0);
		Stream<Integer> ss3 = ss2.map(m -> m * 2);

		ss3.forEach(n -> System.out.println(n));

		int sum = 0;

		for (int n : nrs) {
			if (n % 2 == 0) {
				n = n * 2;
				sum += n;
			}
		}
		System.out.println(sum);
	}
}
