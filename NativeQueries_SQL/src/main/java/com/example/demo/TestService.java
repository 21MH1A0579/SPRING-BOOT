package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	DataRepo repo;
	public List<TestEntity>getalldata(){ 
		return repo.getalldatafromrepo();
		
	}
	
	public List<TestEntity>getbyname(String name){
		return repo.getbyname(name);
	}
	
	public List<TestEntity>getbymarks(String type,String marks){
//		Integer m=Integer.parseInt(marks);
//		if(type.equals("lt"))
//		{
//			return repo.getmarksLesser(m);
//		}else {
//			return repo.getmarksGreater(m);
//		}
		
		if(type.equals("asc")) {
		return repo.findAll(Sort.by(Direction.ASC, marks));
		}else {
			return repo.findAll(Sort.by(Direction.DESC, marks));
		}
	}

}
