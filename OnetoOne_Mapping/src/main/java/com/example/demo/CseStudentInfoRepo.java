package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CseStudentInfoRepo extends JpaRepository<CseStudentInfo, Integer> {
	
	
	@Query("select n from CseStudentInfoRepo n  where n.city=:name")
	public List<CseStudent>findByName(@Param("name") String s);

}
