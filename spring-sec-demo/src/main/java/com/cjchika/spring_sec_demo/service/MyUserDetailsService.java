package com.cjchika.spring_sec_demo.service;

import com.cjchika.spring_sec_demo.model.User;
import com.cjchika.spring_sec_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(username);
        if(user == null){
            System.out.println("User not found!");
            throw new UsernameNotFoundException("User not found!");
        }

        return null;
    }
}
