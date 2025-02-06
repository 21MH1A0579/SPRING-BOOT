package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cse" , produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}

)
public class HomeController {
	
	@Autowired
	MyService service;
	
	@GetMapping("/getdata")
	public List<MyTable> getDetails(){
		return service.getData();
	}
	
	@PostMapping("/insert")
	public String save_Data(@RequestBody MyTable data) {
		service.saveData(data);
		return "SUCCESS";
	}
	

}
