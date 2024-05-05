package com.cjchika.SpringbootJDBC;

import com.cjchika.SpringbootJDBC.model.Student;
import com.cjchika.SpringbootJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringbootJdbcApplication.class, args);

		Student st = context.getBean(Student.class);
		st.setRollNo(1);
		st.setName("CJ");
		st.setMarks(100);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(st);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);

	}

}
