package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Counsellors;
import com.ashokit.entity.Login;

@Service
public interface CounsellorsService {

	List<Counsellors> getAllCounsellors();

	Counsellors saveTask(Counsellors task);
    
	Counsellors findUsers(String email, String password);

	void count(Counsellors counsellors);
		
	
}
