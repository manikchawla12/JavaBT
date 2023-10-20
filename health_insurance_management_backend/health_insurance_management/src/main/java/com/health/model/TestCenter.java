package com.health.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="testCenter")
@Data
@NoArgsConstructor
public class TestCenter{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long centerId;
	
	@Column(name="centerName")
	private String centerName;
	
	@Column(name="centerContact")
	private long centerContact;

	@Column(name="centerAddress")
	private String centerAddress;

	@Column(name="centerEmail")
	private String centerEmail;
	
	@Column(name="testsOffered")
	private String testsOffered;
	

}
