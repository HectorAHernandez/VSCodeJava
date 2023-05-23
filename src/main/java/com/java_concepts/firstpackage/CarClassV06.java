package com.java_concepts.firstPackage;

// implementing an abstract class:

// 3- 'abstractl' modifier: Can use used with all, Class, variables and
//     method.

// - 'abstract' at Class level: when used in a Class declaration, then
//    the Class can contains both 'abstract' and 'NON-abstract" methods

// - 'abstract' at method level: when used in a method, the method
//    CAN NOT have a body: This is, it has to be declared as this:
//          public abstract void startCar();  --> withou {body}
//   'abstract' method CAN ONLY be declared in an 'abstract' Class:

// public abstract class Car {
//    public abstract void startCar();
// }

// NOTE: WE CANNOT CREATE OBJECTS FROM abstract Classes. Therefore,
//      the only way to access the methods (abstract and NON-abstract)
//      in an 'abstract' class is by creating another Class that
//      INHERIT the 'abstract' class. BUT this Child class HAS TO
//      IMPLEMENT THE 'abstract' methods in the 'abstract' Class.
//Then we can create objects of the created Child class.

public abstract class CarClassV06 {

  //abstract method.
  public abstract void startCar();

  // non-abstract method
  public void stopCar() {
    System.out.println("Car stopping...");
  }
}
