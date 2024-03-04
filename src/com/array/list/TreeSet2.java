package com.array.list;
import java.util.LinkedHashSet;

public class TreeSet2 {
	public static void main(String[] args) {
		LinkedHashSet<String> l = new LinkedHashSet();
		l.add("komal");
		l.add("komal");
		l.add("kajla");
		l.add("neha");
		System.out.println(l);
		
		for(String s : l) {
			System.out.println(s);
		}
		System.out.println(l.size());
	}

}
