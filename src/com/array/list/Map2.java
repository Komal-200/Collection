package com.array.list;

import java.util.LinkedHashMap;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		LinkedHashMap<String,Double> l = new LinkedHashMap();  
		l.put("mobile", 9999.45);
		l.put("laptop", 34567.34);
		l.put("ac", 34526.87);
		l.put("tv",25346.98);
		Set<String> s=l.keySet();
		for(String key:s) {
			System.out.println(key+" "+l.get(key));
		}
	}

}
