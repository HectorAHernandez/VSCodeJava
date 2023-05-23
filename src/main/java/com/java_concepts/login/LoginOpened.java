package com.java_concepts.login;

public class LoginOpened {

  // public static variables
  public static String userName2 = "Hector"; // static, to allow the 'main' method, which is
  // static, to access it. Remember Java Rule # 1, static method only can access static
  // variables and method
  public static String password2 = "1234";

  // public static method:
  public static void loginToApplication2() { // also static
    System.out.println(
      "\nLogged into the application userName: " +
      userName2 +
      " password: " +
      password2
    );
  }

  // public default variables
  public String userName = "Hector"; // default
  public String password = "1234"; // default

  // public default method:
  public void loginToApplication() { // also static
    System.out.println(
      "\npublic method --> Logged into the application userName: " +
      userName +
      " password: " +
      password
    );
  }

  public static void main(String[] args) {
    loginToApplication2();
  }
}
