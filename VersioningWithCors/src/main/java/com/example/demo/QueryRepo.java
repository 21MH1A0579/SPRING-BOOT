package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QueryRepo extends JpaRepository<StudentsData, Integer> {
	
	@Query(value = "SELECT name, branch, mobile FROM studentsdatafull WHERE id = :n", nativeQuery = true)
	public List<Object[]> getbyId1(@Param("n") int s);

	
	@Query(value="select * from studentsdatafull where id=:n",nativeQuery=true)
	public StudentsData getbyId2(@Param("n") int s);

}
