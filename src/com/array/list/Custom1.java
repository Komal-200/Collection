package com.array.list;

public class Custom1 {
	public static void main(String[] args) {
		String a="A";
		String b="B";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(a));
		
		Integer c=10;
		Integer d=10;
		System.out.println(c==d);
		System.out.println(d==d);
		System.out.println(c==c);
		System.out.println(c.equals(d));
	} 

}
