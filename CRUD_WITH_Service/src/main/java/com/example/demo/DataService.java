package com.example.demo;

import java.util.List;

public interface DataService {

	public boolean addStudent(DataEntity stu);
	
	public List<DataEntity> getStudents();
	public DataEntity getbyId(int id);
	public boolean updatecse(int id,String branch);
	
	
}
