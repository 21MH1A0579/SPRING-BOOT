package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
     @Autowired
     UserDataRepo repo1;
     @Autowired
     UserLoginRepo repo2;
     @Autowired
     PasswordEncoder encoder;
     
     @PostMapping("/cse/insertuserdata")
     public String insertuserdata(@RequestBody UserData data) {
    	 repo1.save(data);
    	 return "SUCCESSFULLY INSERTED USER_DATA";
     }
     
     @PostMapping("/cse/insertlogindata")
     public String insertLoginData(@RequestBody UserLogin data) {
    	 data.setPassword(encoder.encode(data.getPassword()));
    	 repo2.save(data);
    	 return "SUCCESSFULLY INSERTED USER_LOGIN DATA";
     }
     
     @GetMapping("/cse/displayall")
     @PreAuthorize("hasAuthority('ROLE_ADMIN')")
     public List<UserData> disp(){
    	 return repo1.findAll();
     }
     
     @GetMapping("/cse/display/{id}")
     @PreAuthorize("hasAuthority('ROLE_USER')")
     public Optional<UserData> dispuser(@PathVariable("id") int id ){
    	 return repo1.findById(id);
     }
     
     
     @PutMapping("/cse/update/{id}")
     public String updateUserData(@PathVariable("id") int id, @RequestBody UserData updatedData) {
         return repo1.findById(id).map(existingData -> {
             existingData.setName(updatedData.getName());       // Update name
             existingData.setBranch(updatedData.getBranch());   // Update branch
             existingData.setMarks(updatedData.getMarks());     // Update marks
             repo1.save(existingData);                          // Save updated entity
             return "SUCCESSFULLY UPDATED USER_DATA";
         }).orElse("USER NOT FOUND");
     }


     // DELETE Mapping for deleting user data
     @DeleteMapping("/cse/delete/{id}")
     public String deleteUserData(@PathVariable("id") int id) {
         if (repo1.existsById(id)) {
             repo1.deleteById(id);
             return "SUCCESSFULLY DELETED USER_DATA";
         } else {
             return "USER NOT FOUND";
         }
     }

     
     
     

}
