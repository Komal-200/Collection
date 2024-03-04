package com.array.list;

import java.util.List;

public class LinkedList {
	public static void main(String[] args) {
		List l=(List) new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("------------------");
		for(int i=i.size()-1;i>=0;i--) {
			system.out.println(l.get(i));
		}

    }
	
}
