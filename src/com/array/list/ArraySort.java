package com.array.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(40);
		l.add(50);
		l.add(20);
		l.add(10);
		System.out.println("before sorting");
		
		for(int i=0;i>l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("after sorting");
		Collections.sort(l);
		
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		System.out.println("after sorting by deacrsing order");
		for(int i=l.size();i<0;i--) {
			System.out.println(l.get(i));
		}
	//	for(Object o :l) {
		//	System.out.println(o);
			
		//}
		
	}

}
