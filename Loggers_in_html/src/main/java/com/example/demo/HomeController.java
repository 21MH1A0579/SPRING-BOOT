package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	Logger log=LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	DataRepo repo;
	@PostMapping("/insert")
	public StudentsEntity insert(@RequestBody StudentsEntity sdata) {
		log.info(" METHOD :POST -MESSAGE: INSERTED SUCCESSFULLY ");
		return repo.save(sdata);
	
		
	}
	
	@GetMapping("/students")
	public List<StudentsEntity> disp(){
		List<StudentsEntity> data=(List<StudentsEntity>) repo.findAll();
		log.info(" METHOD :GET -MESSAGE: ALL STUDENTS DISPLAYED ");
		return data;
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(value="id") Integer sid) {
		
		Optional<StudentsEntity>d= repo.findById(sid);
		if(d.isPresent()) {
		  repo.deleteById(sid);
		  log.info(" METHOD :DELETE -MESSAGE: STUDENT DELETED ");
		  return "Deleted";
		}
		log.error(" METHOD :DELETE -MESSAGE: STUDENT NOT FOUND ");
		return "NOT FOUND";
		
	}

}
