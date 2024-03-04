package com.array.list;

import java.util.ArrayList;

public class Program5 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("komal");
		a1.add("kajal");
		a1.add("susmita");
		a1.add("neha");
		String[] str = new String[a1.size()];
		for(int i=0;i<a1.size();i++) {
			str[i]=a1.get(i);
		}
		for(String k : str) {
			System.out.println(k);
		}
	}

}
