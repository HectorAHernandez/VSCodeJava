package com.java_concepts.first_package;

// Method Overriding Concept:
// By using the overriding concept, a Child Class can overrides/changes the behavior of
// the method WITH THE SAME NAME in the Parent class.
// when the method is called from an object created from the Child class, then the 
// method modified in the Child class will be used. But when the method is called from
// and object created from the Parent Class then the method in the Parent class will be used.
// Note: When overriding, the common/existing behavior may or may not stay with the new
//       behavior, depending on the situation.

import com.java_concepts.thirdpackage.Dog;
import com.java_concepts.thirdpackage.Puppy;

public abstract class C10ClassesChildOverridingParentMethod {

	public static void main(String[] args) {
		// Creating object of the Parent class.
		Dog colon = new Dog();
		colon.breed = "Terrier";
		colon.color = "black";
		colon.size = "Big";
		
		colon.eat(); // the method in the Parent class will be used, therefore the
		//           original behavior from Parent/Dog class will perform.
		
		// Creating object of the Child class
		Puppy silky = new Puppy();
		
		silky.age = 7;
		silky.breed = "Trovador";
		silky.color = "silver";
		silky.cuteness_level = "medium";
		silky.size = "small";
		
		silky.eat(); // the method in the Child class will be used, therefore the
		//           NEW/MOFIDIFED behavior from Child/Puppy class will perform.
		
		silky.age = 4;
		silky.eat(); // the method in the Child class will be used, therefore the
		//           NEW/MOFIDIFED behavior from Child/Puppy class will perform.		
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
	// Can happen inside the same class and in a Child class inheriting the parent.
	// Use the same method name. In a Class definition, OVERLOADING allows to define 
	// multiple methods with the same name inside the same Class as long as they differ in 
	// terms of the following (this is changing the method's signature):
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
	

}
