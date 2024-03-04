package com.array.list;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet h =new HashSet();
		h.add(10);
		h.add(10);
		h.add("komal");
		h.add("komal");
		h.add("Komal");
		h.add(11.22);
		h.add(null);
		System.out.println(h.size());
		for(Object o:h) {
			System.out.println(o);
		}
	}

}
