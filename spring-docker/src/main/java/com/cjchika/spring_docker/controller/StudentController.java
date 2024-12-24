package com.cjchika.spring_docker.controller;

import com.cjchika.spring_docker.model.Student;
import com.cjchika.spring_docker.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return repo.findAll();

//                List.of(
//                new Student(1,"Regina", "Mass Comm"),
//                new Student(2,"Ragna", "Bus Admin"),
//                new Student(3,"Jay", "Comp Sc"));
    }
}
