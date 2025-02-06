package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	FaculityRepo repo;
	
	@GetMapping("/acet/home")
	public String home() {
		return "WELCOME TO HOMEPAGE";
	}
	@PostMapping("acet/insert")
	public FaculityEntity insert(@RequestBody FaculityEntity sdata) {
		return repo.save(sdata);
	
		
	}
	
	@GetMapping("acet/faculity")
	public List<FaculityEntity> disp(){
		List<FaculityEntity> data=(List<FaculityEntity>) repo.findAll();
		return data;
	}
	
	
	
	@DeleteMapping("acet/delete/{id}")
	public String delete(@PathVariable String id) {
	    Optional<FaculityEntity> d = repo.findById(id);
	    if (d.isPresent()) {
	        repo.deleteById(id);
	        return "Deleted";
	    }
	    return "EMPLOYEE WITH " + id + " NOT FOUND";
	}
	
	@GetMapping("acet/employee/{id}")
	public Optional<FaculityEntity> empbyyid(@PathVariable String id) {
	    Optional<FaculityEntity> d = repo.findById(id);
	    if (d.isPresent()) {
	        return repo.findById(id);
	    }
		return d;
	   
	}

	
	@GetMapping("/acet/aboutus")
	public String about() {
		return "WELCOME TO ABOUT_US PAGE";
	}

}
