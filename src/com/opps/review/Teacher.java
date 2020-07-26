package com.opps.review;

public class Teacher extends School {
String teacherId;
	
	public void teach() {
		System.out.println("Teachers teach middle school students");
	}
	
	public void doExam() {
		System.out.println("Teachers do exams to evaluate stutents");
	}
	
	public void makePlan() {
		System.out.println("Teachers make course plans");
	}
}
