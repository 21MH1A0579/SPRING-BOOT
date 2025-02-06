package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	      @Bean
	      public UserDetailsService userdetailsservice(PasswordEncoder encoder) {
	    	  
	    	  UserDetails admin= User.withUsername("prasad")
	    			  .password(encoder.encode("acetcse")).roles("ADMIN")
	    			  .build();
	    	  return new InMemoryUserDetailsManager(admin);
	      }
	       
	      @Bean
	      public PasswordEncoder encoder() {
	    	  return new BCryptPasswordEncoder();
	      }
	      
	      @Bean
	      public SecurityFilterChain  securityfilterchain(HttpSecurity http) throws Exception{
	    	       http.csrf(csrf->csrf.disable())
	    	       
	    	          .authorizeHttpRequests(auth->auth
	    	        		  .requestMatchers("/cse/home").permitAll()
	    	        		  .requestMatchers("/cse/students").authenticated()
	    	        		  .requestMatchers("/cse/staff").authenticated()
	    	        		  .requestMatchers("/cse/aboutus").permitAll()
	    	        		  )
	    	          .formLogin(withDefaults());
	    	       
	    	       return http.build();
	    	        		
	    	  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      

}
