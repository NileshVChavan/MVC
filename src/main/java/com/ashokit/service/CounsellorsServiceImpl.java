package com.ashokit.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Counsellors;
import com.ashokit.entity.Login;
import com.ashokit.repository.ICounsellorsRepo;
@Service
public class CounsellorsServiceImpl implements CounsellorsService{
     @Autowired
	  private ICounsellorsRepo counsellorsRepo;
	
	@Autowired
	private ICounsellorsRepo repo;
	@Override
	public List<Counsellors> getAllCounsellors() {
		
		return repo.findAll();
	}
	@Override
	public Counsellors saveTask(Counsellors task) {
		
	    return counsellorsRepo.save(task);
		
	}
	@Override
	public Counsellors findUsers(String email, String password) {
	    Counsellors g=repo.findByEmail(email);
	    if(g!=null) {
	    	return g;
	    }
	    
		return null;
	}
	@Override
	public void count(Counsellors counsellors) {
		
		
	}
	
	

}
