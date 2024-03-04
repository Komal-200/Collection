package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("23");
		linked.add("komal");
		for(String str : linked) {
			System.out.println(str);
		}
		System.out.println(linked.getFirst());
		System.out.println(linked.getLast());
	}

}
