package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository lapRepo;

    public void addLaptop(Laptop lap){
        lapRepo.save(lap);
    }

    public boolean isHighEnd(Laptop lap){
        return true;
    }
}
