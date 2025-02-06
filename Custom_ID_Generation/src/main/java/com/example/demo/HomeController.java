package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	CseSequenceRepo repo;
	
	@PostMapping("/insert")
	public CseCustomId insertdata(@RequestBody CseCustomId data ) {
		return repo.save(data);		
	}

}
