package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( 
		info=@Info(
				title="CseAcetOpenAPI",
				version="1.0",
				description="DEVELOPED BY FINAL CSE",
				contact=@Contact(name="FINAL CSE STUDENTS",email="chaitanya996628@gmail.com")
				)  
		)
public class Springboot17Application {
	public static void main(String[] args) {
		SpringApplication.run(Springboot17Application.class, args);
	}

}
