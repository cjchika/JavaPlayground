package com.cjchika.SpringbootJDBC.repository;

import com.cjchika.SpringbootJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

        int rows = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());

        System.out.println(rows + " effected!");
    }

    public List<Student> findAll(){
        String sql = "select * from student";

      return jdbc.query(sql, (rs, rowNum) -> {
          Student st = new Student();
          st.setRollNo(rs.getInt("rollno"));
          st.setName(rs.getString("name"));
          st.setMarks(rs.getInt("marks"));
          return st;
      });
    }
}
