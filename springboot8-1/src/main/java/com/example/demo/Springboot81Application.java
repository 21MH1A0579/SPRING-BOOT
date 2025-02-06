package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot81Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot81Application.class, args);
	}
	
	     @RequestMapping("/disp")
	     public String disp() {
	    	 return "WELCOME TO AOP";
	     }
}
