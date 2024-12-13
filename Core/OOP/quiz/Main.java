package quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QuestionService svc = new QuestionService();
//        svc.playQuiz();

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(8);
        nums.add(6);

//        for(int n : nums){
//            System.out.println(n);
//        }

//        System.out.println(nums.get(1));

        Map<String, Integer> students = new HashMap<>();

        students.put("Josh",60);
        students.put("Mark",20);

        System.out.println(students);
        System.out.println(students.get("Josh"));
    }

}
