package com.ashokit.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Counsellors;
@Repository
public interface ICounsellorsRepo extends JpaRepository<Counsellors,Integer> {

	 Counsellors findByEmail(String email);
//	 @Query("select password Counsellors where email=?1 and password=?2")
//	String findByPassword(String email,String password);
}
