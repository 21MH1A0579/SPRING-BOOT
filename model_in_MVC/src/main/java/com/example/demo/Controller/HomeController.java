package com.example.demo.Controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Entity;
import com.example.demo.Model.Entity2;
import com.example.demo.Model.MarksEntity;


@Controller
public class HomeController {
	  @RequestMapping("/home")
     public String home(Model model) {
		  model.addAttribute("name","Durga Prasad");
    	 return "csehome";
     }
	  
	  @RequestMapping("/display")
	  public String disp(Model model) {
		  
		 Entity e1=new Entity(501,"YDP","CSE","ACET");
		 model.addAttribute("data",e1);
		  return "display";
	  }
	  
	  @RequestMapping("/multiple")
	  public String disp1(Model model) {
		  Entity cse1=new Entity(501,"Durga","CSE","ACOE");
		  Entity cse2=new Entity(502,"prasad","ECE","ACET");
		  Entity cse3=new Entity(503,"YDP","IT","AEC");
		  Entity cse4=new Entity(504,"chaitanya","MECH","ACOE");
		  Entity cse5=new Entity(505,"MAnik","CSE","ACET");
		  Entity cse6=new Entity(506,"BAla","EEE","AEC");
		  List<Entity> datacse=Arrays.asList(cse1,cse2,cse3,cse4,cse5,cse6);
		  model.addAttribute("data",datacse);
		  return "multiple";
	  }
	  
	  @RequestMapping("/form")
	  public String form() {
		  return "form";
	  }
	  
	  @RequestMapping(path="/save",method=RequestMethod.POST)
	  public ModelAndView dispdata(@ModelAttribute Entity2 cse2) {
		  ModelAndView mv1=new ModelAndView();
		  mv1.setViewName("displaydata");
		  mv1.addObject("datas",cse2);
		  return mv1;  
	  }
	  
	  
	  @RequestMapping("/marks")
	  public String marks(Model model) {
		  MarksEntity s1=new MarksEntity(501,"DP","CSE",70);
		  MarksEntity s2=new MarksEntity(502,"YDP","ECE",89);
		  MarksEntity s3=new MarksEntity(503,"Durga","EEE",65);
		  MarksEntity s4=new MarksEntity(504,"Prasad","MECH",35);
		  MarksEntity s5=new MarksEntity(505,"chaithu","ECE",48);
		  MarksEntity s6=new MarksEntity(506,"Manik","CSE",99);
		  List<MarksEntity> students=Arrays.asList(s1,s2,s3,s4,s5,s6);
		   model.addAttribute("data",students);
		  return "marksdisplay";
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
