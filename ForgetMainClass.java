package com.hyderabadbankapplication;

import java.util.Scanner;

public class ForgetMainClass {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter userName: ");
		String userName1=scanner.nextLine();
		System.out.println("Enter password: ");
		String password1 =scanner.nextLine();
		 
		ForgetPasswordClass forgetPasswordClass= new ForgetPasswordClass("Surya");
		forgetPasswordClass.setPassword("Adil@123");
		if(forgetPasswordClass.userName.equals(userName1) && forgetPasswordClass.getPassword().equals(password1)) {
			System.out.println("login successfull");
		}
		else {
			System.err.println("Invalid userName/password");
			System.out.println("do you want to reset your password "+ " if Yes ..enter 1 ");
			int choice =scanner.nextInt();
			switch (choice) {
			case 1: 
				   System.out.println("enter the new password");
				   scanner.nextLine();
				   String modifiedPassword= scanner.nextLine();
				   forgetPasswordClass.setPassword(modifiedPassword);
				   System.out.println("Your Password changed ");
				   break;
			default: System.out.println("You tried wrong choice ...try again");	
			break;
				
			}
		}
		
	}

}
