package com.array.list;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("canot divid by zero");
			
		}
		System.out.println("main end");
	}

}
