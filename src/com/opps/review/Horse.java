package com.opps.review;

public class Horse extends Animal{  //inheritance Child calss for review Constructors

String breed;
	
	public Horse() {
		super();
		System.out.println("I am non argument constructor insede Horse Class");
	}
	
	public Horse(String breed) {
		super();
		this.breed=breed;
//		System.out.println("Breed is : "+breed);
	}
	
	public Horse(String color, int age, int weight, String breed) {
//		super(color, age, weight);
//		this.breed=breed;
		this(breed);
		super.color=color;
		super.age=age;
		super.weight=weight;
	}

}

