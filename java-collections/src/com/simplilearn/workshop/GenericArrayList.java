package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		List<Integer> partList = new ArrayList<>(3);
		
		partList.add(new Integer(1));
		partList.add(new Integer(2));
		partList.add(new Integer(3));
		
		partList.add(new Integer(4)); // ArrayList auto grows
		
		System.out.println("First Part : " + partList.get(0)); // First Item
		
		partList.add(0, new Integer(5)); // insert an item by index
		
		//partList.add("Bad Data"); compile error now
		
		for ( Integer partNumberObj : partList) {
			int partNumber = partNumberObj;
			
			System.out.println("Part Number :" + partNumber);
		}
	}

}
