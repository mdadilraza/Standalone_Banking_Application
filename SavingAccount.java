package com.hyderabadbankapplication;

public class SavingAccount implements Account{
	final static long account_Number=35402542052L;
	private double totalBalance=2500;
	
 

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	

	@Override
	public void withdraw(double amount) {
		String action="DEBITED";
		if(amount<=totalBalance) {
			totalBalance-=amount;
			displayMessage(action, amount);
		}
		else {
			throw new IllegalArgumentException("Insuffiecient Fund");
		}
		
		
	}

	@Override
	public void deposit(double amount) {
		String action="CREDITED";
		if(amount<=100000) {
			totalBalance+=amount;
			displayMessage(action, amount);
		}
		else {
			throw new IllegalArgumentException("Your are exceeding the Limits");
		}
		
	}

	@Override
	public void balanceInquiry() {
		System.out.println("TotalBalance is:"+totalBalance);
		
		
		
	}

	@Override
	public void displayMessage(String action, double amount) {
		System.out.println("The account number "+account_Number+" and the amount is "+action+" the amount is "+amount+ " Total Balance is "+totalBalance+" from Hyderabad Bank....at 12Am 02/12/2023  visit again@@@@ thank you!...." );
		
		
	}

}
