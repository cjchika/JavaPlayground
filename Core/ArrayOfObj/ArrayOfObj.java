class Student {
    int rollno;
    String className;
    String name;
}

public class ArrayOfObj {
    public static void main(String[] args){
			Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Jimmy";
    s1.className = "SS3";

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Jack";
    s2.className = "SS2";

    Student students[] = new Student[2];

    students[0] = s1;
    students[1] = s2;

		for(Student stud : students){
			System.out.println(stud.name + " : " + stud.className);
		}

		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].name);
		}
	}
}
