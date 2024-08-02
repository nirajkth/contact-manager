package com.neeraj.contact_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.neeraj.controllers.Developer;

@SpringBootApplication()
@ComponentScan(basePackages={"com.neeraj.controllers"})
public class ContactManagerApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
		SpringApplication.run(ContactManagerApplication.class, args);

		Developer developer = context.getBean(Developer.class);
		developer.build();
	}

}
