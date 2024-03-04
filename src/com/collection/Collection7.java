package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection7 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(); 
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(7);
		list2.add(5);
		list2.add(7);
		System.out.println(list1.equals(list2));
		System.out.println(list1==list2);
		list1.add(0, 20);
		System.out.println(list1);
		list1.add(1,21);
		System.out.println(list1);
		System.out.println(list1.indexOf(7));
		//System.out.println(list1.endWith(7));
		System.out.println(list1.contains(5));
	}

}
