package com.cjchika.simplewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hello Guest";
    }

    @GetMapping("info")
    public String aboutMachine(){
        String 
        return "Hello Guest";
    }
}
