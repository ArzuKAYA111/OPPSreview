package com.opps.review;

public class Math {  //  overloading

	public void multiply(int a, int b) {
		System.out.println("int * int");
		System.out.println(a + " x "+ b +" = "+ (a*b));
	}
	
	// we can change the number of parameters
	
	public void multiply(int a, int b, int c) {
		System.out.println("int * int * int");
		System.out.println(a + " x "+ b +" x = "+ (a*b*c));
	}
	
	// we can change the types of  variables
	
	public double multiply(double a, double b) {
		System.out.println("double * double");
		System.out.println(a + " x "+ b +" = "+ (a*b));
		return a*b;
	}
	
	// we can change the types of  variables
	
	public void multiply(double a, int b) {
		System.out.println("double * int");
		System.out.println(a + " x "+ b +" = "+ (a*b));
	}
	
	
	// we can change the order of different type variables
	
	public void multiply(int a, double b) {
		System.out.println("int * double");
		System.out.println(a + " x "+ b +" = "+ (a*b));
	}
	
}

