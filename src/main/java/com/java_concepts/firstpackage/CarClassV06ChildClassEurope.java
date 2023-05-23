package com.java_concepts.first_package;

// implementing a child class of an abstract class:

// 3- 'abstract' modifier: Can use used with all, Class, variables and
//     method.

// - 'abstract' at Class level: when used in a Class declaration, then
//    the Class can contains both 'abstract' and 'NON-abstract" methods

// - 'abstract' at method level: when used in a method, the method
//    CAN NOT have a body: This is, it has to be declared as this:
//          public abstract void startCar();  --> without {body}
//   'abstract' method CAN ONLY be declared in an 'abstract' Class:

// public abstract class Car {
//    public abstract void startCar();
// }

// NOTE: WE CANNOT CREATE OBJECTS FROM abstract Classes. Therefore,
//      the only way to access the methods (abstract and NON-abstract)
//      in an 'abstract' class is by creating another Class that
//      INHERIT the 'abstract' class. BUT this Child class HAS TO
//      IMPLEMENT THE 'abstract' methods in the 'abstract' Class (See
//      @override below)
//      Then we can create objects of the created Child class.

public class CarClassV06ChildClassEurope extends CarClassV06 {

  @Override
  public void startCar() {
    System.out.println(
      "\nabstract method: Car started in child class Car_Class_v06_ChildC_Europe"
    );
  }
}
