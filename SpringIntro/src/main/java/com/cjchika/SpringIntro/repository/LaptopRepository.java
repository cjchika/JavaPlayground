package com.cjchika.SpringIntro.repository;

import com.cjchika.SpringIntro.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saving in database...");
    }
}
