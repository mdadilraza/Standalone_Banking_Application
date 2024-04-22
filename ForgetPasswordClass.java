package com.hyderabadbankapplication;

public class ForgetPasswordClass {
   String userName;
   private String password;
    public ForgetPasswordClass(String userName) {
	this.userName=userName;
	//this.password=password;
}
    //getter method 
    public String getPassword() {
    	return password;
    }
    //setter method 
    public void setPassword(String password) {
    	this.password=password;
    			
    }
}
