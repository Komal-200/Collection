package com.array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Wrapper3 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(29);
		l.add(49);
		l.add(19);
		Collections.sort(l);
		for(Integer i:l) {
			System.out.println(i);
		}
		LinkedList<String> s=new LinkedList<String>();
		s.add("komal");
		s.add("kajal");
		s.add("java");
		s.add("komal");
		Collections.sort(s);
		for(String i:s) {
			System.out.println(i);
			
		}
		
	}

}
