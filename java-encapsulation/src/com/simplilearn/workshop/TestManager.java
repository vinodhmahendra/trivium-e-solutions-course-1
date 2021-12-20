package com.simplilearn.workshop;

import com.simplilearn.domain.Manager;

public class TestManager {

	public static void main(String[] args) {
		Manager manager = new Manager(1, "poonam", "107-99-9078", 109345, "Sales");

		manager.raiseSalary(10000.00);
		
		String name = manager.getName();
		String ssn = manager.getSsn();
		double salary  = manager.getSalary();
		int id = manager.getEmpId();
		String dept = manager.getDepName();
		System.out.println("Name = " + name + " " + "ssn= " + ssn + " " + "salary=" + salary + " " + "id=" + id + " " +"Department=" + dept);
	}

}
