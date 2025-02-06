package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {

	
}
