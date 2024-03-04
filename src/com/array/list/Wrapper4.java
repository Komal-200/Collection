package com.array.list;
import java.util.LinkedList;

public class Wrapper4 {
	public static void main(String[] args) {
		LinkedList<Emp> l= new LinkedList();
		l.add(new Emp(101,"komal"));
		l.add(new Emp(102, "kajal"));
		l.add(new Emp(103, "neha"));
		l.add(new Emp(101,"komal"));
	    System.out.println(l.hashCode());
		for(Emp e:l) {
			System.out.println(e);
		}
	}

}
