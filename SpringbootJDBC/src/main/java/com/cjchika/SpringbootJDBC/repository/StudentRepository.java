package com.cjchika.SpringbootJDBC.repository;

import com.cjchika.SpringbootJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void saveStudent(Student student){
        String sql = "insert into student (rollNo, name, marks) values (?,?,?)";

        int rows = jdbc.update(sql, student.getRollNo(), student.getRollNo(), student.getMarks());

        System.out.println(rows + "effected!");
    }

    public List<Student> findAll(){
        return new ArrayList<>();
    }
}
