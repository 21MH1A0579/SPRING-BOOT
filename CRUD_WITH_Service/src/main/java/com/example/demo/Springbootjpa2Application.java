package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootjpa2Application {

	public static void main(String[] args) {
		ApplicationContext con =SpringApplication.run(Springbootjpa2Application.class, args);
		DataService data=con.getBean(DataServiceImpl.class);
//		DataEntity ent=new DataEntity();
//		ent.setId(502);
//		ent.setName("Durga");
//		ent.setBranch("CSE");
//		ent.setCollege("Acet");
//		boolean status=data.addStudent(ent);
//		if(status) {
//			System.out.println("Inserted SuccessFully");
//			
//		}else {
//			System.out.println("Not Inserted");
//		}
		
//		List<DataEntity> studentsdata=data.getStudents();
//		for(DataEntity stdl:studentsdata) {
//			System.out.println(stdl.getId());
//			System.out.println(stdl.getName());
//			System.out.println(stdl.getBranch());
//			System.out.println(stdl.getCollege());
//			System.out.println("----------------");
//		}
		
		
//		DataEntity dt=data.getbyId(502);
//		if(dt != null) {
//			System.out.println(dt.getId());
//			System.out.println(dt.getName());
//			System.out.println(dt.getBranch());
//			System.out.println(dt.getCollege());
//			
//		}else {
//			System.out.println("Data Not Found");
//		}
		
		
		boolean updatestatus=data.updatecse(501, "ECE");
		if(updatestatus) {
			System.out.println("Updated SuccessFully");
		}else {
			System.out.println("Not Updated");
		}
		
		
		
	}
	
	

}
