package org.coforge.bean;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString


public class User {
	private int id;
	private String name;
	private float salary;
	
	public void init() {
		this.id=45464;
		this.name="AMni";
		this.salary=8754;
		System.out.println("Init called");
	}
	public void destroy() {
		System.out.println("Destroy called");
		
	}
}
