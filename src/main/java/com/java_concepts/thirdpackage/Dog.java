package com.java_concepts.thirdpackage;

public class Dog {
    public String breed;
	public String color;
	public String size;
		
	public void eat() {
		System.out.println("Eating .. "+ breed + " Dog is eating...");
	}
	
	public void sleep() {
		System.out.println(breed + " Dog is sleeping..");
	}
	
	public void bark() {
		System.out.println(breed + " Dog is barking..");
	}
	
	// Overriding is changing a method behavior IN A CHILD class keeping the same method
	// signature (name and parameters) FROM THE PARENT Class.
	
	// Overriding has to occur inside the child class, therefore Overriding is NOT POSSIBLE
	// for CONSTRUCTOR methods; because inside the child class it is not possible to declare
	// a CONSTRUCTOR method with the same signature (name and parameters) than in the Parent
	// class. because when declaring the method the IDE will be asking for a RETURN 
	// Datatype for the method; But then CONSTRUCTOR method DOES NOT have RETURN TYPE. Also,
	// every class has its own constructor.

	
	// Differences between Method OVERLOADING and Method OVERRIDING:
	//Method Overloading Concept:
	// The method's signature is changed name(), name(datatype var1)/ name(datatype var1..)
	// Can happen inside the same class and in a Child class inheriting.
	// Use the same method name. In a Class definition, OVERLOADING allows to define 
	// multiple methods with the same name inside the same Class as long as they differ in 
	// terms of the following (this is changing the method's signature)::
	//       1- Different number of parameters.
	//       2- Different DataType of the parameters.
	//		 3- Different order of the parameters.
	//
	// Method Overriding Concept:
	// The method's signature is NOT changed name(), name(datatype var1)/ name(datatype var1..)
	// Must be in a Parent Child class relationship.
	// Use the same method name and parameters.
	// OVERRIDING allows a Child Class to overrides/CHANGES the behavior of the method WITH
	// THE SAME NAME in the Parent class.

    // OVERLOADING EXAMPLE:
	public void sum() {
		System.out.println("Sum is 0");
	}
	
	public void sum(int a) {
		System.out.println("Sum is the value " + a);
	}
	
	public void sum(int a, int b) {
		System.out.println("Sum is the value " + a + b);
	}
}
