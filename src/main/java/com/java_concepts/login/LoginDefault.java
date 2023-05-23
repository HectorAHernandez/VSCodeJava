package com.java_concepts.login;

// default Class
class LoginDefault {

  // default variables
  String user_name = "Default";
  String password = "1234";

  // default method:
  void logintoApplication() { // also static
    System.out.println(
      "Default method in default Class: userName: " +
      user_name +
      " password: " +
      password
    );
  }
}
