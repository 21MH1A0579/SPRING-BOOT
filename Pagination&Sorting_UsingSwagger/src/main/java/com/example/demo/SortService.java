package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SortService {
	
	@Autowired
	SortRepo repo;
	
	
	public SortEntity insertdata(SortEntity data) {
		return repo.save(data);
		
	}
	
	public List<SortEntity>sortdata(String field){
		return repo.findAll(Sort.by(Sort.Direction.DESC, field));
	}

	public Page<SortEntity> pageoff(int offset,int pagesize){
		Page<SortEntity>data=repo.findAll(PageRequest.of(offset, pagesize));
		return data;
	}
}
