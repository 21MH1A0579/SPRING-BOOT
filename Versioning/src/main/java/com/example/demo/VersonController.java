package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersonController {
	Logger log=LoggerFactory.getLogger(VersonController.class);
	@Autowired
	DataV1Repo v1repo;
	@Autowired
	DataV2Repo v2repo;
	
	//   URI VERSIONING
	 @GetMapping("/cse/v1/students")
	 public List<CseDataV1> getV1Data(){
		 log.info("Get Version 1 Data using URI VERSIONING");
		 return v1repo.findAll();
	 }
	 
	 @GetMapping("/cse/v2/students")
	 public List<CseDataV2> getV2Data(){
		 log.info("Get Version 2 Data using URI VERSIONING");
		 return v2repo.findAll();
	 }
	 
//	 // PARAMETER VERSIONING
//	 @GetMapping(value="/cse/students",params="version1")
//	 public List<CseDataV1> getDataByV1(){
//		 log.info("Get Version 1 Data using PARAMETER VERSIONING");
//		 return v1repo.findAll();
//	 }
//	 
//	 @GetMapping(value="/cse/students",params="version2")
//	 public List<CseDataV2> getDataByV2(){
//		 log.info("Get Version 2 Data using PARAMETER VERSIONING");
//		 return v2repo.findAll();
//	 }
//	 
//	 
//	 // CUSTOM HEADER VERSIONING
//	 @GetMapping(value="/cse/mydata",headers="X-API-VERSION=1")
//	 public List<CseDataV1> getDataByHeaderV1(){
//		 log.info("Get Version 1 Data using CUSTOM HEADER VERSIONING");
//		 return v1repo.findAll();
//	 }
//	 
//	 @GetMapping(value="/cse/mydata",headers="X-API-VERSION=2")
//	 public List<CseDataV2> getDataByHeaderV2(){
//		 log.info("Get Version 2 Data using CUSTOM HEADER VERSIONING");
//		 return v2repo.findAll();
//	 }
//	 
//	 // ACCEPT VERSIONING
//	 @GetMapping(value="/cse/data",produces="application/cse.v1+json")
//	 public List<CseDataV1> getDataByAcceptV1(){
//		 log.info("Get Version 1 Data using ACCEPT VERSIONING");
//		 return v1repo.findAll();
//	 }
//	 
//	 @GetMapping(value="/cse/data",produces="application/cse.v2+json")
//	 public List<CseDataV2> getDataByAcceptV2(){
//		 log.info("Get Version 2 Data using ACCEPT VERSIONING");
//		 return v2repo.findAll();
//	 }
	 
	 
	 
	 
	 
	
	

}
