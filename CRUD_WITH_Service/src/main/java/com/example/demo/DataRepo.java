package com.example.demo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<DataEntity, Serializable> {
	

}
