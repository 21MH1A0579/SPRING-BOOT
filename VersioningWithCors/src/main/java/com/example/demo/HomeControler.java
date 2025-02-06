package com.example.demo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HomeControler {
      @Autowired
      QueryRepo repo;
      
      
      @PostMapping("/cse/insertdata")
      public String insertData(MultipartFile file,String name,String branch,String mobile,int id) throws IOException {
  		StudentsData newdata=new StudentsData();
  		newdata.setId(id);
  		newdata.setName(name);
  		newdata.setBranch(branch);
  		newdata.setMobile(mobile);
  		newdata.setImage(file.getBytes());
  		repo.save(newdata);
  		return "SUCCESS";
  	}
      @GetMapping("/cse/students/v1/{id}")
      public String getdatawithoutimg(@PathVariable int id) {
    	  List<Object[]> result = repo.getbyId1(1);
    	  for (Object[] row : result) {
    	      String name = (String) row[0];
    	      String branch = (String) row[1];
    	      String mobile = (String) row[2];
    	      System.out.println("Name: " + name + ", Branch: " + branch + ", Mobile: " + mobile);
    	  }
    	  return "success";

      }

	
	@GetMapping("/cse/students/v2/{id}")
	public StudentsData getdatawhithimg(@PathVariable int id){
		return  repo.getbyId2(id);
	}
}
