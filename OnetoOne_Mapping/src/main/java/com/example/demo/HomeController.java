package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	CseStudentRepo repo;
	
	@Autowired
	CseStudentInfoRepo repo1;
	
	
	@PostMapping("/insert")
	public String insertdata(@RequestBody CseStudent data) {
		repo.save(data);
		return "SuccessFully Inserted";
	}
	
	@GetMapping("/display")
	public List<CseStudentInfo> displayall(){
		return repo1.findAll();
	}
	
	@GetMapping("/display/{name}")
	public List<CseStudent> displayfrominfo(@PathVariable("name") String name){
		System.out.println(name);
		return repo1.findByName(name);
	}
	
	
	

}
