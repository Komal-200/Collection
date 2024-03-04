package com.collection.set;

 class A{
	int i=4;
	int j=8;
	public boolean equals(Object o) {
		System.out.println("equals");
		A a = (A)o;
		if(this.i == a.i) {
			return true;
		}
		else {
			return false;
		}
		System.out.println(a);
	}
	
		
}


public class HashSet3 {
	public static void main(String[] args) {
		A a1=new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(a1.hashCode());

		System.out.println(a2.hashCode());
		System.out.println(a1.hashCode());
		for(A a : set1) {
			System.out.println(a);
		}
		
	}

}
