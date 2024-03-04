package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add(3);
		list.add(1);
		list.add(10);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		list.add(3,30);
		list.add(0,7);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));//index give and value take.
	}

}
