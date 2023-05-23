package com.java_concepts.firstPackage;

// default Class
class LoginProtectedInThisPackage {

  // protected variables
  protected String user_name = "Protected";
  protected String password = "1234";

  // protected method:
  protected void logintoApplication() { // also static
    System.out.println(
      "Default class - Protected method as public due to same package: Logged into the application userName: " +
      user_name +
      " password: " +
      password
    );
  }
}
