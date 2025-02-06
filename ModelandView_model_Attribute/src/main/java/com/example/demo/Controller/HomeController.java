package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.Model.FormEntity;
@Controller
public class HomeController {
	List<FormEntity>ls=new ArrayList<FormEntity>();
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/form")
	public String form(Model model) {
		FormEntity entity=new FormEntity();
		model.addAttribute("modeldata",entity);
		return "form";
	}
	
//	@RequestMapping(path="/register",method=RequestMethod.POST)
//	  public String dispdata(@ModelAttribute("data") FormEntity data) {
//        	ls.add(data);
//		
//		  return "displaydata";
//	  }
	
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	  public ModelAndView dispdata(@ModelAttribute FormEntity data) {
      	ls.add(data);
		  ModelAndView mv=new ModelAndView();
		  mv.addObject("totaldata",ls);
		  mv.setViewName("displaytotaldata");
		  return mv;
	  }

}
