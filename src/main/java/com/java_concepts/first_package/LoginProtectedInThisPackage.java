package com.java_concepts.first_package;

// default Class
class LoginProtectedInThisPackage {
	
	// protected variables
	protected String user_name = "Protected";   
	protected String password = "1234";
	
	// protected method:
	protected void logintoApplication() {  // also static
		System.out.println("Default class: Logged into the application userName: " + user_name + " password: " + password);
	}
	
	
}
