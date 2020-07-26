package com.opps.review2;

public class TestMethodOverriding {
public static void main(String[] args) {
		
		// create an instance of Tester
		
		Employee tester=new Tester("John", "Brown", "ST0001", 150000, "tester");		
//		tester.work();
//		tester.printDetails();
		
//		tester.test();
		
		Employee emp=new Employee("James", "Johns", "ST0002", 80000);
//		emp.work();
//		emp.printDetails();
		
		Tester tester1=new Tester("Jimmy", "Knight", "ST0003", 160000, "tester");
		
		tester1.test();
		
	}
}
