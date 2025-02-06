package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class SortController {
	
	@Autowired
	SortService cse;
	
	@Operation(
			summary="to insert students data into database",
			description="if you want to add new students details, use this RestEnd API"
			
			)
	@PostMapping("/cse/insert")
	public SortEntity insertdata(@RequestBody SortEntity data) {
		
		return cse.insertdata(data);
		
	}
	@Operation(
			summary="to Sort students by using Feild Name",
			description="if you want to display students details by Feild name, use this RestEnd API"
			
			)
	@GetMapping("/cse/{field}")
	public List<SortEntity> sortdata(@PathVariable("field") String field){
		return cse.sortdata(field);
		
	}
	
	@Operation(
			summary="pagging of data",
			description="pagging of data based on offset and page size"
			)
	@GetMapping("/cse/{offset}/{pagesize}")
	public Page<SortEntity>csepage(@PathVariable int offset,@PathVariable int pagesize){
		
		Page<SortEntity> pagedata=cse.pageoff(offset,pagesize);
		return pagedata;
	}
	

}
