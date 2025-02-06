package com.example.demo;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	
	@Autowired
	ImageRepo repo;
	
	public String insertImg(MultipartFile file,String name,String descp) throws IOException {
		
		ImageData newdata=new ImageData();
		newdata.setName(name);
		newdata.setDescp(descp);
		newdata.setImage(file.getBytes());
		repo.save(newdata);
		return "SUCCESS";
	}
	
	
	public Optional<ImageData> downloadimge(int id) {
		return repo.findById(id);
		
	}

	

}
