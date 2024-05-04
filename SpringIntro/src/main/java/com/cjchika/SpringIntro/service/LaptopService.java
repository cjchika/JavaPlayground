package com.cjchika.SpringIntro.service;

import com.cjchika.SpringIntro.model.Laptop;
import com.cjchika.SpringIntro.repository.LaptopRepository;
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
