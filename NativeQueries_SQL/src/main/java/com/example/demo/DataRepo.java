package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DataRepo extends JpaRepository<TestEntity, Integer> {
	
	@Query("select n from TestEntity n")
	public List<TestEntity>getalldatafromrepo();
	
	@Query(value="select * from testquery where name=:n",nativeQuery=true)
	public List<TestEntity>getbyname(@Param("n") String s);
	
	@Query(value="select * from testquery where marks>:m",nativeQuery=true)
	public List<TestEntity>getmarksGreater(@Param("m") int s);
	
	@Query(value="select * from testquery where marks<:m",nativeQuery=true)
	public List<TestEntity>getmarksLesser(@Param("m") int s);
	
	

}
