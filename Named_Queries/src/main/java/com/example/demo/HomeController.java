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
	NamedRepo repo;
	
	@PostMapping("/insert")
	public CseNamedEntity insert(@RequestBody CseNamedEntity data ) {
		
		return repo.save(data);
	}
	@GetMapping("/display")
	public List<CseNamedEntity> disp(){
		return repo.getall();
	}
	
	
	@GetMapping("/display/{name}")
	public List<CseNamedEntity> disp1(@PathVariable("name") String name){
		return repo.getByName(name);
	}

}
