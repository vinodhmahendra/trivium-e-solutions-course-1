package com.simplilearn.domain;

public class Manager extends Employee {


	private String depName;
	
	public Manager(int empId, String name, String ssn, double salary, String dept) {
		super(empId,name,ssn,salary);
		this.depName = dept;
	}
	
	public String getDepName() {
		return depName;
	}
}
