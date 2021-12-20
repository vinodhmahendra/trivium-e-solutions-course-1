package com.simplilearn.workshop;

import com.simplilearn.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "vinodh", "ab123", 5000);
		
		emp1.raiseSalary(1000);
		
		System.out.println("Details Of Employee 1");
		
		String name = emp1.getName();
		String ssn = emp1.getSsn();
		double salary  = emp1.getSalary();
		int id = emp1.getEmpId();
		
		System.out.println("Name = " + name + " " + "ssn= " + ssn + " " + "salary=" + salary + " " + "id=" + id);
		
		
		Employee emp2 = new Employee(2, "kumar", "ab123", 9000);
		
		emp2.raiseSalary(1000);
		
		System.out.println("Details Of Employee 2");
		
		String name2 = emp2.getName();
		String ssn2= emp2.getSsn();
		double salary2  = emp2.getSalary();
		int id2 = emp2.getEmpId();
		
		System.out.println("Name = " + name2 + " " + "ssn= " + ssn2 + " " + "salary=" + salary2 + " " + "id=" + id2);
		
		emp2.changeName("mahendra");
		name2 = emp2.getName();
		System.out.println("Name = " + name2 + " " + "ssn= " + ssn2 + " " + "salary=" + salary2 + " " + "id=" + id2);
	}

}
