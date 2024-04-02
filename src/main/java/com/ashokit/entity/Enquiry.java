package com.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Enquiry {
	
	@Id
	@SequenceGenerator(name="gen1",allocationSize = 1000,initialValue =1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@NonNull
	private String name;
	
	@NonNull
	private Long phno;
	
	@NonNull
	private String classMode;
	
	@NonNull
	private String course;
	
	@NonNull
	private String status;
	
	

}
