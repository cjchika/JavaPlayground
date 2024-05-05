package com.cjchika.SpringbootJDBC.service;

import com.cjchika.SpringbootJDBC.model.Student;
import com.cjchika.SpringbootJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepo;

    public void addStudent(Student student){
        studentRepo.saveStudent(student);
    }

    public List<Student> getStudents(){
        System.out.println("Getting students...");
        return studentRepo.findAll();
    }

    public StudentRepository getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }
}
