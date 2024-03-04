package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	int i=4;
	int j=5;
	public static void main(String[] args) {
		Set<HashSet1> set1 = new HashSet<HashSet1>();
		HashSet1 a1 = new HashSet1(); 
		HashSet1 a2 = new HashSet1();
		HashSet1 a3 = new HashSet1();
		for(HashSet1 a : set1) {
			System.out.println(a);
		}
	}

}
