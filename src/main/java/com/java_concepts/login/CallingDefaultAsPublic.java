package com.java_concepts.login;

public class CallingDefaultAsPublic {

  public static void main(String[] args) {
    LoginDefault loginDefaultObj = new LoginDefault();
    // here LoginDefault Class behave as 'public' to this
    // 'CallingDefaultClass' because both are declared in the same package.
    // Also, LoginDefault class does not need to be imported because they
    // are in the same package.

    String user = loginDefaultObj.user_name;
    String password = loginDefaultObj.password;

    System.out.println(
      "default variables as public due to same package: User: " +
      user +
      " password: " +
      password
    );

    loginDefaultObj.logintoApplication();
  }
}
