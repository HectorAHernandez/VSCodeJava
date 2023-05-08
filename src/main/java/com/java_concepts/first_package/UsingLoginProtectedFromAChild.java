package com.java_concepts.first_package;

import com.java_concepts.login.LoginProtected;

public class UsingLoginProtectedFromAChild extends LoginProtected{

	public void loginProtectedFromChild() {
		
		// here LoginProtected Class behave as 'public' to this 
		// 'UsingLoginProtectFromAChild' (login package) because this 
		// 'UsingLoginProtectFromAChild' is extending/inheriting the 
		// "LoginProtected" class even though it is declared in a different 
		// package (firstpackage).
		
		// Because we are inheriting we don't need to create an object of the
		// LoginProtected Class, because all variables and methods are 
		// automatically inherited and available here:
		// using 'protected' variables
		System.out.println("\nClass: UsingLoginProtectedFromAChild: user: " + user_name + " password: " + password);
		
		// Using 'protected' method:
		loginToApplication();
		
		user_name = "New New";
		password = "New Password";
		System.out.println("variables changed even inherit even protected --> "
				+"user name: "+user_name + " password:" + password);
		

	}

}
