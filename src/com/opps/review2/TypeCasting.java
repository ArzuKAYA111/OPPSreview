package com.opps.review2;

public class TypeCasting {
// assigning a different type of data to a variable
	
	// upcasting or widening or automatic casting
		// we do not face a risk to lose data
	// downcasting, narrowing of manual casting
	
	// byte - short - int- long - float - double
	
	// 
	
	public static void main(String[] args) {
		
		int i=25;
		double d=i;
	
		System.out.println(d);
		
		double d1=34.678;
		
		int i1=(int)d1;
		System.out.println(i1);
		
		// we are creating an object of Tester class by giving referance to Employee class --> upcasting or wideninig the scope
		
		Employee emp=new Tester("James", "Green", "ST0004", 50000, "developer");
		
		emp.work();
		emp.printDetails();
		
		Tester tester=(Tester)emp;  // --> downcasting or narrowing the scope
		tester.test();
		
		
		Employee emp1=new Employee("Donald", "Duck", "DD0001", 10000);
		
		Tester tester1=(Tester)emp1;
		
		
	}
	
}
