package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	RegRepo repo;
	@RequestMapping("/form")
	public String form(Model model ) {
		RegEntity ent=new RegEntity();
		model.addAttribute("cseform",ent);
		return "form";
		
	}
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public String insert(@ModelAttribute("cseform") RegEntity cseform) {
		
		repo.save(cseform);
		return "redirect:/display";
		
	}
	
	@RequestMapping("/display")
	public String getall(Model model) {
		List<RegEntity>data=(List<RegEntity>) repo.findAll();
		model.addAttribute("csedata",data);
		return "display";
	}
	
     @GetMapping("/byname")
     public String getbyname() {
    	 List<RegEntity> list=repo.findByNameAndBranch("prasad","cse");
    	 System.out.println(list);
    	 return "display";
    	 
     }
}
