package org.coforge.bean;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString

@Data
public class Employee {

	private int id;
	private String name;
	private float salary;	
	
	private Address address;
}
