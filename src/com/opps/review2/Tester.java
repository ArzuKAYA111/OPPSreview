package com.opps.review2;

public class Tester extends Employee{

	String jobTitle;

	public Tester(String name, String lastName, String empId, int salary, String jobTitle) {
		super(name, lastName, empId, salary);
		this.jobTitle=jobTitle;
	}
	
	public void work() {
		System.out.println(name+" "+lastName+" tests web applications at "+ COMPANY_NAME);
	}

	public void printDetails() {
		super.printDetails();		
		System.out.println("Job title : "+ jobTitle);
	}
	
	public void test() {
		System.out.println("Tester does UI Testing");
	}
}
