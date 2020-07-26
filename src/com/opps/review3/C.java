package com.opps.review3;




//  interface i bircok class ta implement yapmissak interface e yeni bir unimplement method
//eklersek butun kilaslari modifiye etmeliyiz onu yerine 
// 1-we can add default implemented method by using " default keyword "

//why we use default implement method in interface ?
// to prevent any problem which implements the interface

//we can override default methods based on our needs 


//2- we can add static method 



// we can override default methods from interface into subclasss/conctret class but we cannot override static method from interface 
public interface C extends A,B {
​
	void method5();

}
