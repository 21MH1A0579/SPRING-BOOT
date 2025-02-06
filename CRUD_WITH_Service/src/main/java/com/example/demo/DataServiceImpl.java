package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

	
	@Autowired 
	private DataRepo drepo;
	@Override
	public boolean addStudent(DataEntity stu) {
		boolean status=false;
		try {
		    drepo.save(stu);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}
	
	@Override
	public List<DataEntity> getStudents() {
		
		return (List<DataEntity>) drepo.findAll();
		
		
	}

	@Override
	public DataEntity getbyId(int id) {
		
	    Optional<DataEntity> opt=drepo.findById(id);
	    if(opt.isPresent()) {
	    	return opt.get();
	    }
	    else {
	    	return null;
	    }
	
	}

	@Override
	public boolean updatecse(int id, String branch) {
		
	      DataEntity et=getbyId(id);
	      if(et!=null) {
	    	  et.setBranch(branch);
	    	  drepo.save(et);
	    	  return true;
	      }
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
