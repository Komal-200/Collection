package com.array.list;

public class Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");
		}
		catch(NullPointerException e) {
			System.out.println("hello");
		}
		finally(){
			System.out.println("finaly");
		}
	}

}
