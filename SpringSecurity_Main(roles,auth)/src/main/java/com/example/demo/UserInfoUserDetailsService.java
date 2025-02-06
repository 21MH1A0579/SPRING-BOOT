package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserInfoUserDetailsService implements UserDetailsService {

	@Autowired
	UserLoginRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UserLogin> userinfo=repo.findByName(username);
		return userinfo.map(UserInfoDetails::new)
				.orElseThrow(()->new UsernameNotFoundException("USER NOT FOUND"+username)); 
	}

}
