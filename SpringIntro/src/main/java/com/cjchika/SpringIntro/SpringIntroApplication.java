package com.cjchika.SpringIntro;

import com.cjchika.SpringIntro.model.Alien;
import com.cjchika.SpringIntro.model.Laptop;
import com.cjchika.SpringIntro.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIntroApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

//		Alien alien = context.getBean(Alien.class);
//		alien.code();
//		System.out.println(alien.getAge());
	}

}
