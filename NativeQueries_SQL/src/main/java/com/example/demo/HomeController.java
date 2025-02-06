package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	 @Autowired
	 TestService service;
	@GetMapping("/display/all")
	public List<TestEntity> getall(){
		return service.getalldata();
	}
	
	@GetMapping("/display/{name}")
	public List<TestEntity> getbyname(@PathVariable("name") String name){
		return service.getbyname(name);
	}
	
	@GetMapping("/display/marks/{type}/{marks}")
	public List<TestEntity> getbymarks(@PathVariable("type") String type,@PathVariable("marks") String marks){
		
		return service.getbymarks(type, marks);
		
	}
	
}
