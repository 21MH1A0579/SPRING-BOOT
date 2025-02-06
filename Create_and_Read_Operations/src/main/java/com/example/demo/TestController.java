package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

	@Autowired
	DemoRepo repo;
	
	@GetMapping("/home")
	public String home() {
		return "homepage";
	}
	
	@PostMapping("/insert")
	public DemoEntity insertdata(@RequestBody DemoEntity data) {
		
		return repo.save(data);
		
	}
	
	@GetMapping("/disp")
	public List<DemoEntity> displayall(){
		return repo.findAll();
	}
	
	@GetMapping("/disp/{id}")
	public Optional<DemoEntity> getById(@PathVariable("id") int id) {
		return repo.findById(id);
	}
}
