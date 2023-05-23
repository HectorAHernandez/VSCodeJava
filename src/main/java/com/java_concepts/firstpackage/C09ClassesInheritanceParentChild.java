package com.java_concepts.first_package;

// testing GitL

import com.java_concepts.thirdpackage.Dog;
import com.java_concepts.thirdpackage.Puppy;


//Inheritance is a mechanism in which one class (Child) acquires the properties (Instance variables
//and methods) defined in another class (Parent). Through inheritance we don't have to re-create the
//properties that already exist in another class, we can re-USE that code.
//The java keyword 'extends' is used to define a Class as a Child of a Parent Class.
// For example in the thirdpackge.Puppy class --> public class Puppy extends Dog {

public abstract class C09ClassesInheritanceParentChild {
    	public static void main(String[] args) {
	
		//Creating an object from the Parent Class Dog.
		Dog lacy = new Dog();
		
		lacy.breed = "Boxter";
		lacy.color = "Brown";
		lacy.size = "Medium";
		
		lacy.bark();
		lacy.eat();
		lacy.sleep();
		
		
		//Craating object from the child Class Puppy:
		System.out.println("\n***** Child class Puppy");
		
		Puppy trevol = new Puppy();
		
		trevol.breed = "Chiguagua";
		trevol.color = "White";
		trevol.size = "very small";
		trevol.cuteness_level = "high";
		
		System.out.println("The level of cuteness of trevol is " + trevol.cuteness_level);
		trevol.bite();
		trevol.bark();
		trevol.eat();
		trevol.sleep();		

				
	}

    
}
