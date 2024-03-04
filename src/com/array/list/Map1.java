package com.array.list;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(10,"java");
		h.put("hi", 11.22);
		h.put('k', 20);
		h.put(1.2,"hello");
		h.put(99, 99);
		h.put("hi", "hi");
		System.out.println(h);
	}

}
