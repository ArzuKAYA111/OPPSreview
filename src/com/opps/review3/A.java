package com.opps.review3;

public interface A {
	// all methods are implicitly public abstract in interface
	
		// Can we add implemented methods inside Interface?
		
		// 1. We can add default methods inside Interface
			// to prevent any problem which implements the interface
			// we can override default mothods based on our needs.
		// 2. Static Methods
			// We cannot override static
		
		void method1();
		void method2();
		
//		void method6();
		
		default void method7() {
			System.out.println("I am default method defined/implemented inside Interface A");
		}
		
		static void method8() {
			System.out.println("I am static method implemented inside Interface A");
		}
	}
