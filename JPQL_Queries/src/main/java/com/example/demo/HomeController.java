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
	QueryService cse;
	
	@PostMapping("/insert")
	public QueryEntity insertdata(@RequestBody QueryEntity data) {
		return cse.mydata(data);
	}
	
	@GetMapping("/display")
	public List<QueryEntity> getdata(){
		return cse.getalldata();
	}
	@GetMapping("/display/{name}")
	public List<QueryEntity> getName(@PathVariable(value="name") String name){
		return cse.getname(name);
	}
	
//	@GetMapping("/display/{name}/{branch}")
//	public List<QueryEntity> getNameandbranch(@PathVariable(value="name") String name,@PathVariable(value="branch") String branch){
//		return cse.getusingNandB(name, branch);
//	}
//	
	@GetMapping("/display/{type}/{marks}")
	public List<QueryEntity> getMarksBytype(@PathVariable(value="type") String type,@PathVariable(value="marks") String marks){
		return cse.getMarksGreaterThan(type,Integer.parseInt(marks));
	}

}
