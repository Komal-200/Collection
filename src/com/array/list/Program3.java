package com.array.list;

import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) throws Exception {
		try {
			ArrayList<Integer> arrlist = new ArrayList<Integer>();
			arrlist.add(1);
			arrlist.add(2);
			arrlist.add(3);
			arrlist.add(4);
			arrlist.add(5);
			System.out.println("Before opration:"+ arrlist);
            int i = arrlist.set(3, 30);	
            System.out.println("After opration: "+arrlist);
            System.out.println("Replace element: " +i);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Exception thrown: "+e);
		}
	}

}
