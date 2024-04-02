package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Enquiry;

public interface IEnquiryRepo extends JpaRepository<Enquiry, Integer>{

}
