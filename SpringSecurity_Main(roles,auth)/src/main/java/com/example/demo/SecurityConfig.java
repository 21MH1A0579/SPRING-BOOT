package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityfilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(auth->auth
				.requestMatchers("/cse/insertuserdata").permitAll()
				.requestMatchers("/cse/insertlogindata").permitAll()
				.requestMatchers("/cse/displayall").authenticated()
				.requestMatchers("/cse/display/**").authenticated()
				.requestMatchers("/cse/update/**").permitAll()
				.requestMatchers("/cse/delete/**").permitAll()
		).formLogin(withDefaults());
		return http.build();
	} 
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public UserDetailsService userdetailsservice() {
		return new UserInfoUserDetailsService();
		
	}
	
	@Bean
	public AuthenticationProvider authenticationprovider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userdetailsservice());
		provider.setPasswordEncoder(passwordencoder());
		return provider;
	}
	
	
	

}
