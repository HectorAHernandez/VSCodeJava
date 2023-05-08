package com.java_concepts.login;

public abstract class LoginRestricted {
	
	// private static variables
	private static String userName2 = "Hector";   // static, to allow the 'main' method, which 
	// is static, to access it. Remember Java Rule # 1, static method only can access static
	// variables and method
	private static String password2 = "1234";
	
	// private method:
	private static void loginToApplication2() { // also static
		System.out.println("Logged into the application userName: " + userName2 +
		" password: " + password2);
	}

	/*
	// private variables
	private String userName = "Hector";   // default
	private String password = "1234";
	
	// private default method:
	private void loginToApplication() {  // also static
		System.out.println("Logged into the application userName: " + userName +
		" password: " + password);
	}*/

	
	// private static method:
	public static void main(String[] args) {
		loginToApplication2();
	}

}
