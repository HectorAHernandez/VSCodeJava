package com.java_concepts.firstPackage;

// default Class
class LoginDefaultInThisPackage {

  // default variables
  String user_name = "Hector default var"; // static, to allow the 'main' method, which is static,
  //       to access it. Remember Java Rule # 1, static method only can access static variables and method
  String password = "1234";

  // default method:
  void loginToApplication() { // also static
    System.out.println(
      "Default method in default class as public: Logged into the application userName: " +
      user_name +
      " password: " +
      password
    );
  }
}
