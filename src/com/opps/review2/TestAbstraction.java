package com.opps.review2;

public class TestAbstraction {

	public static void main(String[] args) {
		
		// can we create object of abstract class directly? NO
//		BankAtm atm1=new BankAtm();		
		
		// can we create object of abstract class indirecly? Yes		
		
		BankAtm atm=new ChaseBankAtm();
//		atm.depositMoney("checking", 1550.00);
//		atm.depositCheck("saving", 1200.00);
		
		atm.withdrawMoney("checking", 1370.00);
	}
}
