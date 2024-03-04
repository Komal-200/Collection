package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {
	public static void main(String[] args) {
		List list=new ArrayList();
		Collection3 coll = new Collection3();
		list.add(3);
		list.add(65);
		list.add(7);
		list.add(45);
		list.add(3,6);
		list.add("komal");
		list.add(list);
		
		//for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i));
		//}
		System.out.println(coll);
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
