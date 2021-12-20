package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Thomas Jefferson", 1, 3.8));
		studentList.add(new Student("John Adams", 2, 3.9));
		studentList.add(new Student("George Washington", 3, 3.4));
		
		Comparator<Student> sortName = new StudentSortName();
		
		Collections.sort(studentList,sortName);
		
		for ( Student student: studentList) {
			System.out.println(student);
		}
		
		System.out.println("****************************************************");

		Comparator<Student> sortGpa = new StudentSortGpa();
		
		Collections.sort(studentList,sortGpa);
		
		for ( Student student: studentList) {
			System.out.println(student);
		}
		
	}

}
