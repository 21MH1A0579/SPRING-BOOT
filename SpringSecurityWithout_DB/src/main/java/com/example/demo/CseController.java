package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	
	@GetMapping("/cse/home")
	public String csehome() {
		
		return "WELCOME TO CSE HOMEPAGE";
	}
	
	@GetMapping("/cse/students")
	public String csestudents() {
		return "WELCOME TO CSE STUDENTS PAGE";
	}
	
	@GetMapping("/cse/staff")
	public String csestaff() {
		return "WELCOME TO CSE STAFF PAGE";
	}
	
	@GetMapping("/cse/aboutus")
	public String cseabout() {
		return "WELCOME TO CSE ABOUT US PAGE";
		
	}

}
