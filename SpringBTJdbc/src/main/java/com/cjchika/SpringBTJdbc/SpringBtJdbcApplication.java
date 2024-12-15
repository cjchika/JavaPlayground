package com.cjchika.SpringBTJdbc;

import com.cjchika.SpringBTJdbc.model.Student;
import com.cjchika.SpringBTJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBtJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBtJdbcApplication.class, args);

		Student stud = context.getBean(Student.class);
		stud.setRollNo(100);
		stud.setName("CJ");
		stud.setMarks(98);

		StudentService svc = context.getBean(StudentService.class);
		svc.addStudent(stud);

		List<Student> students = svc.getStudents();
		System.out.println(students);
	}

}
