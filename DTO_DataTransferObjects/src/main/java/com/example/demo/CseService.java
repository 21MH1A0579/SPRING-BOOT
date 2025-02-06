package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CseService {
	@Autowired
	StudentRepo repo;
	public String insertdata(StudentDTO dto) {
		Student st=new Student();
		st.setName(dto.getName());
		st.setBranch(dto.getBranch());
		//repo.save(st);
		Address ad=new Address();
		ad.setCity(dto.getCity());
		ad.setState(dto.getState());
		st.setAddress(ad);
		repo.save(st);
		return "success";
	}

}
