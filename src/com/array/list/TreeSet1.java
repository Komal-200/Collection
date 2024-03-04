package com.array.list;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t =new TreeSet();
		t.add(10);
		try {
			t.add(null);
		}
		catch(NullPointerException e) {
			System.out.println("null");
		}
		t.add(10);
		System.out.println(t);
		
	}

}
