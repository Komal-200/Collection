package com.collection.set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map<Integer, String> employees  = new LinkedHashMap<Integer, String>();
		employees.put(1, "komal");
		employees.put(5, "sush");
		employees.put(2, "madhu");
		employees.put(4, "kajal");
		employees.put(5, "komal");
		employees.put(1, "hello");
		employees.put(6, null);
		//employees.put(null, null);
		//employees.put(null, "hi");
		
//		System.out.println(employees.get(2));
//		System.out.println(employees.get(3));
//		System.out.println(employees.remove(1));
//		System.out.println(employees.get(1));
		
		Set<Integer> keySet = employees.keySet();
		for(int key : keySet) {
			System.out.println("The key is "+key+" and the value is "+employees.get(key));
		}
		
		
	}

}
