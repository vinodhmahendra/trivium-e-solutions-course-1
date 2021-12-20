package com.simplilearn.workshop;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> partList = new TreeMap<>();
		
		partList.put("S001", "Blue Polo Shirt");
		partList.put("S002", "Black Polo Shirt");
		partList.put("H002", "Duke Hat");
		
		partList.put("S002", "Black T-Shirt"); // overwrite value
		
		
		Set<String> keys = partList.keySet();
		
		System.out.println("=== Part List ===");
		for (String key : keys) {
			System.out.println("Part#: " + key);
			System.out.println("Value: " + " " + partList.get(key));
		}
		
		//partList.remove("S002");
		System.out.println("size : " + partList.size());
		System.out.println("Is Empty : " + partList.isEmpty());
		
		System.out.println("Contains S002 : " + partList.containsKey("S002"));
		
		Collection<String> values = partList.values();
		System.out.println(values);
		
		
		for(Entry<String, String> m : partList.entrySet()) {
			System.out.println(m.getKey() + " \t " + m.getValue());
		}
		
	}
}
