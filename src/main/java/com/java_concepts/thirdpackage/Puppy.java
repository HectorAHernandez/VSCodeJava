package com.java_concepts.thirdpackage;

// Inheritance is a mechanism in which one class (Child) acquires the properties (Instance variables
// and methods) defined in another class (Parent). Through inheritance we don't have to re-create the
// properties that already exist in another class, we can re-USE that code.
// The java keyword 'extends' is used to define a Class as a Child of a Parent Class.

public class Puppy extends Dog {
    	public String cuteness_level;
	public int age;
	
	public void bite() {
		System.out.println("Puppy is biting..");
	}
	
	// Method Overriding Concept:
	// By using the overriding concept, a Child Class can override/change the behavior of
	// the method WITH THE SAME NAME in the Parent class.
	// when the method is called from an object created from the Child class, then the 
	// method modified in the Child class will be used. But when the method is called from
	// and object created from the Parent Class then the method in the Parent class will be used.
	// Note: When overriding, the common/existing behavior may or may not stay with the new
	//       behavior, depending on the situation.
	

	public void eat() {
		// Existing behavior in Parent class:
		System.out.println("Eating .. "+ breed + " Dog is eating...");
		
		// New behavior:
		if (age < 5) {
			System.out.println("** puppy with size "+ size +" Can only eat very Soft food");
		}
		else {
			System.out.println("** puppy with color "+ color +" Can eat ANY food");
		}
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

    // OVErrideing the sum() method in the Parent class Dog:
	public void sum() {
		System.out.println("Puppy Sum is Zero0ssssss");
	}
	
	// Oveloading the sum() method in this Child class Puppy
	// And ALSO Overriding the sum(int a, int b) method in the Parent class Dog
	public void sum(int a, int b) {
		System.out.println("Puppy Sum is the VALUES ** " + a + b);
	}
}
