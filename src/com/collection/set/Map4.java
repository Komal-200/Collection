package com.collection.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Employee{
	int employeeId;
	String name;
	int salary;
	
	
	public Employee(int employeeId, String name, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}


	public static Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

public class Map4 {
	public static void main(String[] args) {
		//<List<Employee> employees = new ArrayList<Employee>();
		//Employee  employee1 = new Employee();
		Map<Integer,Employee> m=new HashMap<Integer,Employee>();
		
		Employee e1=new Employee(1,"komal" ,30000);
		Employee e2=new Employee(2,"kajal", 25000);
		Employee e3=new Employee(3, "neha", 45000);
		m.put(e1.employeeId, e1);
		m.put(e2.employeeId, e2);
		m.put(e3.employeeId, e3);
		//System.out.println(e1.employeeId);
	//	Set<Integer> keySet = Employee.keySet();
		int sal[] = new int[2];
		int i=0;
		Set<Integer> keySet = Employee.keySet();
		for(int key : keySet) {
			Employee e=m.get(key);
			if(e.salary>=50000) {
				sal[i]=e.salary;
				i++;
			}
		}
		for(int h:sal) {
			System.out.println(h);
		}
		
		
	}

}
