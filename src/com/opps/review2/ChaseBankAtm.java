package com.opps.review2;

public class ChaseBankAtm extends BankAtm{
	@Override
	public void depositMoney(String accountType, double amount) {
		System.out.println("$"+amount+" is deposited to your "+accountType+ " account.");
	}

	@Override
	public void depositCheck(String accountType, double amount) {
		System.out.println("$"+(amount*0.99)+" is deposited to your "+accountType+ " account.");		
	}

}
