package com.example.demo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface DataRepo extends CrudRepository<StudentsEntity, Serializable> {
	
	public List<StudentsEntity>findById(int id);
	public List<StudentsEntity>findByName(String name);
	public List<StudentsEntity>findByBranch(String branch);
	public List<StudentsEntity>findByCollege(String college);
	public List<StudentsEntity>findByCity(String city);
	
	@Transactional
    void deleteById(int id);
	@Transactional
    void deleteByName(String name);  // Delete by name
    
    @Transactional
    void deleteByBranch(String branch);  // Delete by branch

    @Transactional
    void deleteByCollege(String college);  // Delete by college
    
    @Transactional
    void deleteByCity(String city);

}
