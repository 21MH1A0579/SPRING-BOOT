package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QueryRepo extends JpaRepository<QueryEntity, Integer> {
	
	
//	@Query("select n from QueryEntity n")
//	public List<QueryEntity> getAll();
	
	@Query("select n from QueryEntity n where n.name=:s")
	public List<QueryEntity>getByName(@Param("s") String name);
	
	@Query("select n from QueryEntity n where n.name=:s and n.subject=:b")
	public List<QueryEntity>getByNameAndBranch(@Param("s") String name,@Param("b") String branch);
	
	@Query(value="select * from csequery",nativeQuery=true)
	public List<QueryEntity> getAll();
	
	@Query(value="select * from csequery where marks > :s",nativeQuery=true)
	public List<QueryEntity>getMarksGreater(@Param("s") int marks);
	
	@Query(value="select * from csequery where marks < :s",nativeQuery=true)
	public List<QueryEntity>getMarksLesser(@Param("s") int marks);

}
