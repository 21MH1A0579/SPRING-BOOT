package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CseErrorController {
	
	
	@GetMapping("/cse/disp1")
	public String home() {
		if(new Random().nextInt(10)>6) {
			throw new RuntimeException("Final CSE Exception");	
		}		
		return "home";
	}
	
	@GetMapping("/cse/disp2")
	public String home1() {
		if(new Random().nextInt(10)>6) {
			throw new NotImplementedException("Our Own Exception");
		}		
		return "home";
	}
	
	

}
