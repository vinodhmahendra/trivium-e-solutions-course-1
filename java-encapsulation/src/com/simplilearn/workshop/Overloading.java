package com.simplilearn.workshop;

/*
 * Argument lists must differ
 * Return type can be different
 */
public class Overloading {
	
	public void print (int i) {
		System.out.println(i);
	}
	
	public void print (float f) {
		System.out.println(f);
	}
	
	public void print (String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.print(5);
		
		overloading.print("hello");
		
		overloading.print(5.5f);
	}
}
