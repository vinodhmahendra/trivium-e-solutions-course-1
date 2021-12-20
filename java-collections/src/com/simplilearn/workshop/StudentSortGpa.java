package com.simplilearn.workshop;

import java.util.Comparator;

public class StudentSortGpa implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if ( s1.getGpa() < s2.getGpa()) {
			return 1;
		}else if ( s1.getGpa() > s2.getGpa()) {
			return -1;
		}else {
			return 0;
		}
	}

}
