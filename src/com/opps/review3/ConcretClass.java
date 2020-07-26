package com.opps.review3;

public class ConcretClass extends AbstractClass {
	// instance variables
	
		String name, lastName;
		int age;
		
		@Override
		public void method5() {
			System.out.println("I am method5 implemented inside ConcreteClass");
			
		}

		@Override
		public void method2() {
			System.out.println("I am method2 implemented inside ConcreteClass");
			
		}

		@Override
		public void method3() {
			System.out.println("I am method3 implemented inside ConcreteClass");
			
		}

		@Override
		public void method4() {
			System.out.println("I am method4 implemented inside ConcreteClass");
			
		}
		
//		public void method7() {
//			System.out.println("I am default method implemented inside ConcreteClass");
//		}
}
