package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CorsController {
	@Autowired
	CorsRepo repo;
	
	@CrossOrigin(origins="http://127.0.0.1:5500")
	@GetMapping("/getdata")
	public List<CorsDataTable> getData(){
		return repo.findAll();
	}

}
