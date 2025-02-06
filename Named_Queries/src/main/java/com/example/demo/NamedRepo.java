package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NamedRepo extends JpaRepository<CseNamedEntity, Integer> {
	
	List<CseNamedEntity> getall();
    List<CseNamedEntity> getByName(String name);
}
