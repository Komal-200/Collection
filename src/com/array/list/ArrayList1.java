package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("komal");
		l.add(null);
		l.add("komal");
		l.add('k');
		l.add(10.89);
		l.add(null);
		l.add(5, "komal");
	//	l.addAll(4, l);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.contains(10));
		System.out.println(l.remove(2));
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		
		
		
		
		
	}

}
