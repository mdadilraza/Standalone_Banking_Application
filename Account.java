package com.hyderabadbankapplication;

public interface Account {
	public void withdraw(double amount);
	public void deposit(double amount);
	public void balanceInquiry();
	public void displayMessage(String action,double amount);

}
