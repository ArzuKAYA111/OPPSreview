package com.opps.review2;

                 
	public class MainMethodOverloding {
		public static void main(String[] args) {
			System.out.println("I am main method with String of Arrays as parameter");
		}
		
		public static void main(String args) {
			System.out.println("I am main method with a String as a parameter");
		}
		
		public static void main(int i) {
			System.out.println("I am main method with an int as parameter");
		}
		
		public static void main(String str, int i) {
			System.out.println("I am main method with one String and one int parameter");
		}
}

		
	
