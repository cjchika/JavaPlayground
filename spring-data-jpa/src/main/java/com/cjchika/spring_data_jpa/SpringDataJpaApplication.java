package com.cjchika.spring_data_jpa;

import com.cjchika.spring_data_jpa.model.Student;
import com.cjchika.spring_data_jpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean((StudentRepo.class));

		Student stud1 = context.getBean(Student.class);
		Student stud2 = context.getBean(Student.class);

		stud1.setRollNo(1);
		stud1.setName("Maximilian");
		stud1.setMarks(90);

		stud2.setRollNo(2);
		stud2.setName("Josh");
		stud2.setMarks(77);

//		repo.save(stud1);
//		repo.save(stud2);

//		System.out.println(repo.findByName("Josh"));
//		System.out.println(repo.findByMarks(88));
	}
}
