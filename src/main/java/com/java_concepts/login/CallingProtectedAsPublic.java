package com.java_concepts.login;

public abstract class CallingProtectedAsPublic {

	public static void main(String[] args) {
		
		LoginProtected loginProtectedObj = new LoginProtected();
		// here LoginProtected Class behave as 'public' to this 
		// 'CallingProtectedAsPublic' because both are declared in the same package.
		
		String user = loginProtectedObj.user_name;
		String password = loginProtectedObj.password;
		
		System.out.println("User: " + user + " password: " + password);
		
		loginProtectedObj.loginToApplication();
				

	}

}
