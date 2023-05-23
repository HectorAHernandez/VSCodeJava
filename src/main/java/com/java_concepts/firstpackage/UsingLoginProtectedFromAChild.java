package com.java_concepts.firstPackage;

import com.java_concepts.login.LoginProtected;

public class UsingLoginProtectedFromAChild extends LoginProtected {

  public void loginProtectedFromChild() {
    // here LoginProtected Class (in login package) behave as 'public' to this
    // 'UsingLoginProtectFromAChild' (in this first_package) because this
    // 'UsingLoginProtectFromAChild' is extending/inheriting the
    // "LoginProtected" class even though it is declared in a different
    // package (login package).

    // Because we are inheriting we don't need to create an object of the
    // LoginProtected Class, because all variables and methods are
    // automatically inherited and available here:
    // using 'protected' variables
    System.out.println(
      "\n05 protected variables as public due to inheriting from different package: UsingLoginProtectedFromAChild: user: " +
      user_name +
      " password: " +
      password
    );

    // Using 'protected' method:
    System.out.println(
      "05 calling protected method as public due to inheriting from different package -->"
    );
    loginToApplication();

    user_name = "New New"; // changing the protected variables in an inheriting/child class.
    password = "New Password";
    System.out.println(
      "protected variables changed in inherit-child class and different packages --> " +
      "user name: " +
      user_name +
      " password:" +
      password
    );
  }
}
