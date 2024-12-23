package com.cjchika.spring_sec_demo.repository;

import com.cjchika.spring_sec_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
