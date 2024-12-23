package com.cjchika.spring_sec_demo.controller;

import com.cjchika.spring_sec_demo.model.User;
import com.cjchika.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
