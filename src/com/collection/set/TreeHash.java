package com.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Iphone implements Comparable<Iphone> {
	int manufactureDate;
	int curbWeight;
	int price;
	String color;
	
	public int compareTo(Iphone o) {
		int value = 0;
		if(this.price<o.price) {
			value = -1;
		}
		else if(this.price<o.price) {
			value = 1;
			
		}
		return value;
		
	}
	public String toString() {
		return "color is "+color+" "+"price is "+price+" "+"manufactureDate is "+manufactureDate;
	}
}
class ManufacturingDateComparator implements Comparator<manufactureDateComparator>{
	
	public int compare(Iphone o1,Iphone o2) {
		int value = 0;
		if(o1.manufactureDate < o2.manufactureDate) {
			value=-1;
		}
		else if(o1.manufactureDate < o2.manufactureDate) {
			value = 1;
		}
		return value;
		
	}
}

public class TreeHash {
	public static void main(String[] args) {
		Set<Iphone> set = new TreeSet<Iphone>(new ManufacturingDate());
		Iphone i1=new Iphone();
		Iphone i2= new Iphone();
		Iphone i3 = new Iphone();
		i1.price=56;
		i2.price=26;
		i3.price=12;
		i1.color="black";
		i2.color="apple";
		i3.color="white";
		
		set.add(i1);
		set.add(i2);
		set.add(i3);
		for(Iphone a : set) {
			System.out.println(a);
		}
		
		
	}

}
