package com.collection.set;

import java.util.HashSet;
import java.util.Set;

class A{
	int i=4;
	public boolean equals(Object o) {
		System.out.println("inside equals");
		A a = (A)o;
		boolean status = false;
		if(this.i == a.i) {
			status = true;
		}
		return status;
		
	}
	public int hashCode() {
		return 43;
	}
}

public class ClassA {
	public static void main(String[] args) {
		Set<A> set = new HashSet<A>();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		System.out.println(set.size());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1.hashCode());
	}

}

