package com.hyderabadbankapplication;

import java.util.Random;

public class OTPGenerateClass {
public static void main(String[] args) {
	System.out.println(otp());
	
}
public static String otp() {
	int length=6;
	String numbers="0123456789";
	Random random=new Random();
	char[]otp=new char[length];
	//StringBuilder otp=new StringBuilder();
	for (int i = 0; i < length; i++) {
		otp[i]=numbers.charAt(random.nextInt(numbers.length()));
	  //otp.append(numbers.charAt(random.nextInt(numbers.length())));
	}
	return new String(otp);
}
}
