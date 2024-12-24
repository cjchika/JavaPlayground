package com.cjchika.spring_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        return List.of(
                new Student(1,"Regina", "Mass Comm"),
                new Student(2,"Ragna", "Bus Admin"),
                new Student(3,"Jay", "Comp Sc"));
    }
}
