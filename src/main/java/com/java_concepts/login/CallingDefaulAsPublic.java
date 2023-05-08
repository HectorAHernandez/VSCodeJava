package com.java_concepts.login;

public class CallingDefaulAsPublic {

	public static void main(String[] args) {
		
		LoginDefault login_deflt_obj = new LoginDefault();
		// here LoginDefault Class behave as 'public' to this 
		// 'CallingDefaultClass' because both are declared in the same package.
		
		String user = login_deflt_obj.user_name;
		String password = login_deflt_obj.password;
		
		System.out.println("User: " + user + " password: " + password);
		
		login_deflt_obj.logintoApplication();
				
		


	}

}
