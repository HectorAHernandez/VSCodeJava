package com.java_concepts.firstPackage;

// testing GitL
// This is another version using the keyword 'this.' in the CarClassv02 Class definition
// This is another version using the CarClassV03 which implement the Constructor or method Overloading
// concepts, which allow to call the Class constructor with different: number of parameters, or order or
// Datatype of the parameters. This is:

//Method or Constructors Overloading Concept: In a Class definition, allows to define
// multiple methods with the same name inside the same Class as long as they differ in
// terms of the following (this is changing the method's signature):
//       1- Different number of parameters.
//       2- Different DataType of the parameters.
//		 3- Different order of the parameters.
//Basically, the method's signature is changed name(), name(datatype var1)/ name(datatype var1..)

//Overloading is changing a method behavior by changing its signature using the 3 mentioned
// above.

// Overloading can happen in two scenarios:
// 1- Inside the same class (Vertical overloading)
// 2- Outside or in a child class of Class defining the method.

public abstract class C07ClassesUsingConstructorOverloadingConcept {

  public static void main(String[] args) {
    CarClassV03 bmw = new CarClassV03("Brown", "A Special", 12, 25500); //Here the Constructor is Simplifying the INITIALIZATION process
    System.out.println("\n***** My BMW car details are: ");
    bmw.carDetails();

    CarClassV03 toyota = new CarClassV03("Green", "Corolla", 31);
    System.out.println("\n***** My Toyota car details are: ");
    toyota.carDetails();

    CarClassV03 hyundai = new CarClassV03("Red", "Sonata", "25");
    System.out.println("\n***** My Hyundai car details are: ");
    hyundai.carDetails();

    CarClassV03 ford = new CarClassV03(23, "Pink", "Scort");
    System.out.println("\n***** My Ford car details are: ");
    ford.carDetails();

    CarClassV02 honda = new CarClassV02("White", "Accourd", 21, 9500);
    CarClassV02 audi = new CarClassV02("Red", "Oceanic", 14, 31520);

    System.out.println("\n***** My Audi car details are: ");
    audi.carDetails();
    System.out.println("\n***** My HOnda car details are: ");
    honda.carDetails();
  }
}
