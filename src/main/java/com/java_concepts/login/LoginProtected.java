package com.java_concepts.login;

// public Class
public class LoginProtected {
	
	// protected variables
	protected String user_name = "Protected";   
	protected String password = "1234";
	
	// protected method:
	protected void loginToApplication() {  // also static
		System.out.println("Protected class: Logged into the application userName: " + user_name + " password: " + password);
	}
	
	
}
