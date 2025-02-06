package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.ModelCse;

@Controller
public class SecondController {
    @RequestMapping("/index")
    public String index() {
    	
    	return "index";
    	
    }
    @RequestMapping("/profile")
    public String profile() {
    	return "profile";
    }
    
    
    @RequestMapping("/form")
    public String form(Model model) {
    	 ModelCse ent=new ModelCse();
    	  model.addAttribute("modelcse",ent);
    	return "form";
    } 
    
    
    @RequestMapping(path="/register", method=RequestMethod.POST)
	public String displaydata(@ModelAttribute("modelcse") ModelCse modelcse) {
    	
    	return "form";
    }
	
	
  }
	
	
