package com.example.demo;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
;

@Controller

public class ImageController {

	@Autowired
	ImageService cse;
	
	@PostMapping("/cse/insertimage")
	public String insertimage(@RequestParam("file") MultipartFile file, 
			@RequestParam("name") String name,
			@RequestParam("descp") String descp) throws IOException {
		
		 return cse.insertImg(file, name, descp);
		
	}
	
	
	@GetMapping("/cse/getimage/{id}")
	public String getimage(@PathVariable int id, org.springframework.ui.Model model){
		
		byte[] pic=cse.downloadimge(id).get().getImage();
		String name=cse.downloadimge(id).get().getName();
		String descp=cse.downloadimge(id).get().getDescp();
		int imgid=cse.downloadimge(id).get().getId();
		String sc=""+imgid;
//		return ResponseEntity.status(HttpStatus.OK)
//				.contentType(MediaType.valueOf("image/png"))
//				.body(pic);
		 String base64Image = Base64.getEncoder().encodeToString(pic);
		 model.addAttribute("img",base64Image);
		 model.addAttribute("name",name);
		 model.addAttribute("descp",descp);
		 model.addAttribute("id",sc);
		 return "display";
		 
	}
	
	
	
	
}
