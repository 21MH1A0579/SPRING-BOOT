package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<StudentsEntity, Integer> {

}
