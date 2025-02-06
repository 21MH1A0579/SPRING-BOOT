package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepo extends JpaRepository<UserLogin, Integer> {

	Optional<UserLogin> findByName(String username);

}
