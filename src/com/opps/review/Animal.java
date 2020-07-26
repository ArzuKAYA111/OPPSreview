package com.opps.review;

public class Animal { // inheritance parent class for review Constructors
	String color;
	int age, weight;
	
	public Animal() {
		System.out.println("I am non argument construtor inside Animal Class");
	}
	
	public Animal(String color, int age, int weight) {
		this.color=color;
		this.age=age;
		this.weight=weight;
	}
}
