package com.opps.review;

public class TestInheritance {

public static void main(String[] args) {
		
		School teacher=new Teacher();
		
		teacher.name="John";
		teacher.lastName="Brown";
		School.schoolName="Timber Middle School";
		
		// can we access teacherId --> NO --> Because our referance 
		// while creating the teacher is School Class
		
		School chemistryTeacher=new ChemistryTeacher();
		
		chemistryTeacher.name="Jimmy";
		chemistryTeacher.lastName="Johns";
		// no need to intialize schoolName again since it is a static
		// variable and initialized previously
		
		School.schoolName="Harvard University";
		
		Teacher chemTeach=new ChemistryTeacher();
		
		chemTeach.teacherId="CT1234";
		
		// doExperiment() method will not be available for us
		
		ChemistryTeacher ct=new ChemistryTeacher();
		
		ct.doExperiment();
		ct.doExam();
	}
}

