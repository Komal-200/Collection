package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet4 {
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("komal");
		set1.add("kajal");
		set1.add("madhu");
		set1.add("sushmita");
		set1.add("komal");
		String str = ("komal");
		System.out.println(str.hashCode());
		System.out.println(set1);
	}

}
