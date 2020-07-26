package com.opps.review2;

public abstract class BankAtm {
public abstract void depositMoney(String accountType, double amount);
	
	public abstract void depositCheck(String accountType, double amount);
	
	// amount must be multiples of $10
	// amount must be less than $1000 per day
	
	public void withdrawMoney(String accountType, double amount) {
		if(amount%10!=0) {
			System.out.println("Invalid amount. Amount must be multiples of $10");
		}else {
			if(amount>1000) {
				System.out.println("Daily withdrawal amount cannot be more than $1000");
			}else {
				System.out.println("$"+amount+" is withdraw from your "+accountType+ " account.");
			}
		}
	};
}
