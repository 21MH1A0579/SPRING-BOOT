package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springboot7Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot7Application.class, args);
	}
	
	@RequestMapping("/home")
	public String disp() {
		return "WELCOME TO AOP";
	}

}
