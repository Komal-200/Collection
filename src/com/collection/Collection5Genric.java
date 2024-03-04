package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection5Genric {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		//list.add("komal");
		for(int val : list) {
			System.out.println(val);
		}
		list.clear();
		list.add(5);
		list.add(7);
		for(int val : list) {
			System.out.println(val);
		}
		
	}

}
