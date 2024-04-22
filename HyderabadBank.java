package com.hyderabadbankapplication;

import java.util.Scanner;

public class HyderabadBank {

	public static void main(String[] args) {
		String accountHolderName = "Adil Raza";
		long mbNo = 7561959536L;
		String panCard = "BYE676TS";
		int mPin = 2733;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 digits pin Number:");
		int pinNumber = scanner.nextInt();
		if (mPin == pinNumber) {
			System.out.println("Enter Your Mobile Number:");
			long mobileNumber = scanner.nextLong();
			if (mobileNumber == mbNo) {
				String otpNum = OTPGenerateClass.otp();
				int otp2 = Integer.parseInt(otpNum.toString());
				System.out.println(otpNum);

				System.out.println("Enter The OTP");
				int confOTP = scanner.nextInt();
				// otp Validation
				if (confOTP == otp2) {
					System.out.println("***************************************************");
					System.out.println(accountHolderName + " welcome to Hyderabad Bank ");
					System.out.println("------------------------------------------------------");
					System.out.println("1. SavingAccount");
					System.out.println("2. LoanAccount");
					System.out.println("Select The Type of account");
					int accountType = scanner.nextInt();
					switch (accountType) {
					case 1: {
						System.out.println("------------------------------------------------");
						System.out.println("1. Withdraw");
						System.out.println("2. Deposit");
						System.out.println("3. BalanceEnquiry");
						System.out.println("Enter your Choice :");
						int choice = scanner.nextInt();
						// object creation for savingAccount
						SavingAccount account = new SavingAccount();

						switch (choice) {
						case 1: {
							System.out.println("Enter The Amount:");
							double amount = scanner.nextDouble();
							account.withdraw(amount);// calling the withdraw method
						}
							break;
						case 2: {
							System.out.println("Enter The Amount:");
							double amount = scanner.nextDouble();
							account.deposit(amount);// calling the deposit method
						}
							break;
						case 3: {

							account.balanceInquiry();// caliing the withdraw method
						}
							break;
						default:
							System.err.println("You Choosen a Wrong Choise.......");

						}

					}
						break;
					case 2: {
						System.out.println("------------------------------------------------");
						System.out.println("1. Withdraw");
						System.out.println("2. Deposit");
						System.out.println("3. BalanceEnquiry");
						System.out.println("Enter your Choice :");
						int choice = scanner.nextInt();
						// object creation for LoanAccount
						LoanAccount account = new LoanAccount();
						switch (choice) {
						case 1: {
							System.out.println("Enter The Amount:");
							double amount = scanner.nextDouble();
							account.withdraw(amount);// calling the withdraw method
						}
							break;
						case 2: {
							System.out.println("Enter The Amount:");
							double amount = scanner.nextDouble();
							account.deposit(amount);// calling the deposit method
						}
							break;
						case 3: {

							account.balanceInquiry();// caliing the withdraw method

						}
							break;
						default:
							throw new IllegalArgumentException("You choosen the incorrect type");

						}
					}
						break;
					default:
						throw new IllegalArgumentException("You have Choosen invalid choice.....");
					}
				} else {
					throw new IllegalArgumentException("You entered invalid Otp....");
				}

			} else {
				throw new IllegalArgumentException("Enter The Correct Mobile Number.....");
			}

		} else {
			throw new IllegalArgumentException("Invalid pin Number.....");
		}
	}
}
