package com.array.list;

import java.util.LinkedHashMap;

public class Map4 {
	public static void main(String[] args) {
		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "oppo");
		l.put(2, "vivo");
		l.put(3, "oppo");
		System.out.println(l);
		l.put(1, "sony");
		l.put(2, "bose");
		l.put(3, "bose");
		System.out.println(l);
	}

}
