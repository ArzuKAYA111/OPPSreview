package com.opps.review2;

public class Employee {
	String name, lastName, empId;
	int salary;
	static final String COMPANY_NAME="Syntax Technologies"; // --> Constant
	
	public Employee(String name, String lastName, String empId, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.empId=empId;
		this.salary=salary;
	}
	
	public void work() {
		System.out.println(name+" "+lastName+" works at "+COMPANY_NAME+".");
	}
	
	public void printDetails() {
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println("Name and lastname: "+name+" "+lastName);
		System.out.println("Employee ID: "+empId);
		System.out.println("Salary : "+salary);
	}
}
