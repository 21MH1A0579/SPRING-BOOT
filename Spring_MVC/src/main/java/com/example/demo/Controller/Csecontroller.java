package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.CseModel;

@Controller
public class Csecontroller {
	@RequestMapping("/home")
	public String home() {
		  return "home";
	}

	@RequestMapping("/display")
	public String disp(Model model) {
		CseModel cse1=new CseModel(501,"prasad","CSE","ACET","kkd");
		CseModel cse2=new CseModel(502,"chaitanya","ECE","ACOE","kkd");
		CseModel cse3=new CseModel(503,"manik","CSE","AEC","kkd");
		CseModel cse4=new CseModel(504,"bala","EEE","BVC","Rjy");
		CseModel cse5=new CseModel(505,"sathwik","MECH","PRAG","kkd");
		CseModel cse6=new CseModel(506,"hemanth","IT","GIET","RJY");
		List<CseModel>datacse=Arrays.asList(cse1,cse2,cse3,cse4,cse5,cse6);
		model.addAttribute("data",datacse);
		return "display";
	}
}
