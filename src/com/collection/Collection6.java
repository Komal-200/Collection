package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(834);
		list.add(45);
		list.add(56);
		Integer removalElement = 3;
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("remove element :"+ list.remove(0));//i will take index
		System.out.println(list.remove(removalElement));
		for(Object o : list) {
			
			System.out.println(o);
		}
	}

}
