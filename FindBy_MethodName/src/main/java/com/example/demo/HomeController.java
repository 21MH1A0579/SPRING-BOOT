package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	DataRepo repo;
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/insert")
	public String insert(Model model) {
		StudentsEntity stumodel=new StudentsEntity();
		model.addAttribute("stmodel",stumodel);
		return "insert";
	}

	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	public String submit(@ModelAttribute("stmodel") StudentsEntity stdata) {
		  repo.save(stdata);
		  return "redirect:/insert";
	}
	
	@RequestMapping("/listall")
	public String showall(Model model) {
		List<StudentsEntity>allstudents=(List<StudentsEntity>) repo.findAll();
		model.addAttribute("allstudents",allstudents);
		return "display";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	@PostMapping("/searchsubmit")
    public String submitForm(@RequestParam("ddvalue") String ddvalue, @RequestParam("tfvalue") String tfvalue, Model model) {
		
		List<StudentsEntity>querydata;
		if(ddvalue.equals("id")) {
			querydata=repo.findById(Integer.parseInt(tfvalue));
		}
		else if(ddvalue.equals("name"))
		{
			querydata=repo.findByName(tfvalue);
		}
		else if(ddvalue.equals("branch"))
		{
			querydata=repo.findByBranch(tfvalue);
		}
		else if(ddvalue.equals("college"))
		{
			querydata=repo.findByCollege(tfvalue);
		}
		else 
		{
			querydata=repo.findByCity(tfvalue);
		}
        System.out.println(querydata);
		model.addAttribute("allstudents",querydata);
        return "display"; 
    }
	
	@RequestMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	
	@PostMapping("/deletesubmit")
    public String deleteresult(@RequestParam("ddvalue") String ddvalue, @RequestParam("tfvalue") String tfvalue, Model model) {
		
		if(ddvalue.equals("id")) {
			repo.deleteById(Integer.parseInt(tfvalue));
		}
		else if(ddvalue.equals("name"))
		{
			repo.deleteByName(tfvalue);
		}
		else if(ddvalue.equals("branch"))
		{
			repo.deleteByBranch(tfvalue);
		}
		else if(ddvalue.equals("college"))
		{
			repo.deleteByCollege(tfvalue);
		}
		else 
		{
			repo.deleteByCity(tfvalue);
		}
		model.addAttribute("info","deleted succesfully");
        return "success"; 
	}
	
	
	@RequestMapping("/update")
	public String update(Model model) {
		List<StudentsEntity>allstudents=(List<StudentsEntity>) repo.findAll();
		model.addAttribute("allstudents",allstudents);
		return "update";
	}
	
	
	@PostMapping("/updatestudent")
	public String updatestudent(@RequestParam("studentId") String id,@RequestParam("name") String name,@RequestParam("branch") String branch,
			@RequestParam("college") String college,@RequestParam("city") String city,
			Model model){
		System.out.println(name+id+branch+college+city);
		
		StudentsEntity updatedstudent=new StudentsEntity();
		updatedstudent.setId(Integer.parseInt(id));
		updatedstudent.setBranch(branch);
		updatedstudent.setCollege(college);
		updatedstudent.setName(name);
		updatedstudent.setCity(city);
		repo.save(updatedstudent);
		model.addAttribute("info","updated successfully");
		return "success";
	}
	

}
