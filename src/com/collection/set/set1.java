package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class set1 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("komal");
		set1.add("surbhi");
		set1.add("madhu");
		set1.add("aneesh");
		set1.add("komal");
		for(String name : set1) {
			System.out.println(name);
		}
		
		
	}

}
