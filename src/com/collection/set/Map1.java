package com.collection.set;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int employeeId;
	String name;
	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
	public Employee() {
		
	}
}

public class Map1 {
	public static void main(String[] args) {
		//Employee[] employee = new Employee[4];
		List<Employee> employees = new ArrayList<Employee>();
		Employee  employee1 = new Employee();
		employee1.employeeId = 100;
		
		
	}

}
