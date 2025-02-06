package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot6Application {
    Logger  log= LoggerFactory.getLogger(Springboot6Application.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot6Application.class, args);
	}
	

	@RequestMapping("/disp")
	public String disp() {
		int a=10,b=0,c=0;
		try {
			c=a/b;
		}catch(Exception e) {
			
           log.error(e.getMessage());
			
		}
//		int a=10,b=5;
//		int c=a/b;
		
	return "Welcome to Loggers";
	}

}
