package com.example.demo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RegRepo extends CrudRepository<RegEntity, Serializable> {
	
	public List<RegEntity>findByBranch(String branch);
	public List<RegEntity>findByNameAndBranch(String name,String branch);

}
