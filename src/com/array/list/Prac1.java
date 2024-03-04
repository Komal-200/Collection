package com.array.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Prac1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>(5);
		arrlist.add(15);
		arrlist.add(0);
		arrlist.add(null);
		arrlist.add(0, 10);
		arrlist.add(1, 34);
		//arrlist.add(56);
		for(Integer number : arrlist) {
			System.out.println("Number:"+ number);
		}
		arrlist.remove(1);
		arrlist.remove(1);
		System.out.println(arrlist);
		arrlist.remove(Integer.valueOf(10));
		System.out.println(arrlist);
		arrlist.add(10);
		arrlist.add(5);
		arrlist.add(4);
		arrlist.add(20);
		//Iterator itr = arrlist.iterator();
		System.out.println(arrlist);
		
	}

}
