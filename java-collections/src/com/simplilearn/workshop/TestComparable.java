package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		
		//Set<ComparableStudent> studentList = new TreeSet<>();
		
		List<ComparableStudent> studentList = new ArrayList<>();
		
		studentList.add(new ComparableStudent("Thomas Jefferson", 1, 3.8));
		studentList.add(new ComparableStudent("John Adams",2, 3.9));
		studentList.add(new ComparableStudent("George Washington", 3, 3.4));
		studentList.add(new ComparableStudent("John Adams", 4, 3.0));
		
		Collections.sort(studentList);
		
		for(ComparableStudent student : studentList) {
			System.out.println(student);
		}

	}

}
