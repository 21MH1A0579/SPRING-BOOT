package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {
	
	@Autowired
	QueryRepo repo;
	
	
	public QueryEntity mydata(QueryEntity data) {
		return repo.save(data);
	}

	public List<QueryEntity>getalldata(){
		
		return repo.getAll();
	}
	public List<QueryEntity>getname(String name){
		return repo.getByName(name);
	}
	
	public List<QueryEntity>getusingNandB(String name,String branch){
		
		return repo.getByNameAndBranch(name, branch);
	}
	
public List<QueryEntity>getMarksGreaterThan(String type,int marks){
		
	if(type=="gt") {
		return repo.getMarksGreater(marks);
	}else {
		return repo.getMarksLesser(marks);
	}
	}
}
