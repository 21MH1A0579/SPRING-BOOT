package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CseSwaggerRepo extends JpaRepository<CseSwagger, Integer> {

	@Transactional
	@Modifying
	@Query("delete from CseSwagger a where a.branch=:b")
	int deletebybranch(@Param("b") String branch);

	
	@Transactional
	@Modifying
	@Query("update CseSwagger a set a.branch=?1 where a.branch=?2")
	int updatebybranch(String b1, String b2);

}
