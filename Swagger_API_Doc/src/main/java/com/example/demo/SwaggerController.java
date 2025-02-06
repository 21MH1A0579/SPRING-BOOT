package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@CrossOrigin("http://localhost:4200/")
public class SwaggerController {
	@Autowired
	CseSwaggerRepo repo;
	
	@Operation(
			summary="to insert students data into database",
			description="if you want to add new students details, use this RestEnd API"
			
			)
	@PostMapping("/cse/insert")
	public Object insert(@RequestBody CseSwagger data) {
		 repo.save(data);
		 return "SuccessFully Inserted";
	}
	
	
	
	@Operation(
			summary="to display all students data from database",
			description="if you want to dispaly new students details, use this RestEnd API"
			
			)
	@GetMapping("/cse/display")
	public List<CseSwagger> display(){
		return repo.findAll();
	}
	
	
	@Operation(
			summary="to dispaly particular student by ID",
			description="if you want to display students details using ID, use this RestEnd API"
			
			
			)
	@GetMapping("/cse/display/{id}")
	public Optional<CseSwagger> dispbyid(@Parameter(description="Enter ID of a Student",required=true)@PathVariable("id") int sid){
		return repo.findById(sid);
	}
	
	
	@Operation(
			summary="to delete students by branch",
			description="if you want to delete students details using branch, use this RestEnd API"
			
			
			)
	@DeleteMapping("/cse/delete/{branch}")
	public int deletedata(@PathVariable("branch") String branch) {
		
		
		return repo.deletebybranch(branch);
	}
	
	
	@Operation(
			summary="to update new branch with old branch",
			description="if you want to display students details using ID, use this RestEnd API"
			
			
			)
	@PutMapping("/cse/update/{b1}/{b2}")
	public int updatedata(@PathVariable String b1,@PathVariable String b2) {
		
		
		return repo.updatebybranch(b1,b2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
