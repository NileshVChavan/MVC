
package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

@Entity
public class Counsellors {
	
	@Id
	@SequenceGenerator(name="gen1",allocationSize = 1000,initialValue = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer id;

	private String name;
	
	@Column(unique = true)
	private String email;
	
	
	private String password;
	

	private Long phno;
	

}
