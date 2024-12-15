package com.example.demo;

import com.example.demo.model.Engineer;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

	LaptopService svc = context.getBean(LaptopService.class);

	Laptop lap = context.getBean(Laptop.class);
	svc.addLaptop(lap);

	}
}
