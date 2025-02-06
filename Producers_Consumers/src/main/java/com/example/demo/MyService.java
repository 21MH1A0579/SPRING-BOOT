package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired 
	MyRepo repo;
	
	public List<MyTable> getData(){
		return  repo.findAll();
	}
	
	public String saveData(MyTable data) {
		repo.save(data);
		return "SUCCESS";
	}

}
