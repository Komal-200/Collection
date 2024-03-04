package com.array.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		List l1 = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.add(1, 50);
		System.out.println(l);
		l.set(2, 60);
		System.out.println(l);
		
		for(Object o: l) {
			System.out.println(o);
		}
		
	}

}
