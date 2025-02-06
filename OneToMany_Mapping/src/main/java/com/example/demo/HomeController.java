package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	FacultyRepo repo;
	
	@PostMapping("/insert")
	public String insertdata(@RequestBody Faculity data) {
		repo.save(data);
		return "success";
	}

}
