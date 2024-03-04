package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection4 {
	public String toString(){
		return "Hi. komal";
	}
	public static void main(String[] args) {
		List list = new ArrayList();
		Collection4 coll = new Collection4();
		list.add(30);
		list.add(34);
		list.add(coll);
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

}
