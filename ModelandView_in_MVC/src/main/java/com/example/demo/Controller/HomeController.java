package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/disp")
	public ModelAndView disp() {
		ModelAndView model=new ModelAndView();
		model.addObject("name","prasad");
		model.addObject("id",501);
		model.setViewName("disp");
	    return model;
	}
	
	@RequestMapping("/form")
	public String form1() {
		
		return "form";
	}
	@RequestMapping(path="/register",method = RequestMethod.POST)
	public String formdata(@ModelAttribute("cse") FormEntity cse) {
		return "success";
		
	}
	

}
