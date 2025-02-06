package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( 
		info=@Info(
				title="Pagging",
				version="2.0",
				description="DEVELOPED BY FINAL CSE",
				contact=@Contact(name="CSE STUDENTS",email="cse@gmail.com")
				)  
		)
public class Springboot101Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot101Application.class, args);
	}

}
