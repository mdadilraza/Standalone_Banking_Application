package com.hyderabadbankapplication;

import java.text.DateFormat;
import java.time.LocalDateTime;

public class LoanAccount implements Account {
	final static long account_Number=35402542052L;
	double totalBalance=100000;
	double targetAmount=500000;

	@Override
	public void withdraw(double amount) {
		String action="CREDITED ";
		if((totalBalance+amount)<=targetAmount) {
			totalBalance+=amount;
			displayMessage(action, amount);
		}
		else {
			throw new IllegalArgumentException ("You are Exceeding Your Target....Check Your target amount");
		}
		
	}

	@Override
	public void deposit(double amount) {
		String action="DEBITTED";
		if(amount<=150000) {
			totalBalance-=amount;
			displayMessage(action, amount);
		}
		else {
			throw new IllegalArgumentException("Pay base on the limit ....as bank guidence");
		}
		
	}

	@Override
	public void balanceInquiry() {
		System.out.println("The Total Balance is:"+totalBalance);
		
		
	}

	@Override
	public void displayMessage(String action, double amount) {
		System.out.println("The account number "+account_Number+" and the amount is "+action+" the amount is "+amount+ " Total Balance is "+totalBalance+" from Hyderabad Bank....at" +LocalDateTime.now()  +"visit again@@@@ thank you!...." );
		
		
		
	}

}
