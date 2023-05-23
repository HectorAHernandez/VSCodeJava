package com.java_concepts.firstPackage;

public abstract class C01DemoClass {

  public static void main(String[] args) {
    System.out.println("Hello Hector!!!!!");
    System.out.print("Second Line");
    System.out.println("Third Line");
    System.out.println(999);
    System.out.println();

    byte a = 127; // use one byte, max value is 127
    short b = 32767; // use two bytes, max value is 32767
    int c = 2147483647; // use four bytes, max value is 2147483647
    long d = 9223372036854775807L; // use 8 bytes max 9223372036854775807L

    float e = 1.25f;
    double f = 9999.3652;

    char oneCharacter = 'c';
    boolean h = false; // or true;

    System.out.println(
      "c: " +
      c +
      " f: " +
      f +
      " oneCharacter: " +
      oneCharacter +
      " h: " +
      h +
      " d: " +
      d +
      " e: " +
      e +
      " "
    );

    int aa = 5;
    System.out.println(aa %= 2);

    //boolean cc = a > b ? true : false; // false --> false
    //System.out.println("cc --> " + cc);

    String ccc = (a > b) ? "Hector" : "Amparo"; // false --> Amparo
    System.out.println("ccc --> " + ccc);
  }
}
