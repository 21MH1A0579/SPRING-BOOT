package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
		

	}
	@RequestMapping("/aop")
	public String aop()
	{
		int r=new Random().nextInt(15);
		if(r<=10)
		{
			throw new RuntimeException("Exception occured");
		}
     	System.out.println("This is from business logic");
		return "Welcome to aop";
	}
}