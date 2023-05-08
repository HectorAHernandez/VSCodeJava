package com.java_concepts.secondpackage;

// Using a Class defined in a different Package. 
// We need to import the Class into the calling Class/Program.
import com.java_concepts.first_package.CarClassV04;

//import com.java_concepts.thirdpackage.*;
//import thirdpackage.Black;  // below three were eliminated by using the above
//import thirdpackage.Blue;   // import thirdpackage.*;
//import thirdpackage.Orange;

// To access any method OR Instance variables defined in the Class from different package, those 
// methods OR Instance variables need to be defined as public, if not then we will get error.

public abstract class C08ClassesUsingPackages {

	public static void main(String[] args) {
		// 
		CarClassV04 bmw = new CarClassV04("Brown", "Class AA", 15, 45200);
		
		System.out.println(bmw.model);
		System.out.println(bmw.cost);
		System.out.println(bmw.color);
		System.out.println(bmw.milage);
		
		bmw.startCar();
		bmw.carDetails();
		bmw.stopCar();
		
		//Black black = new Black();
		//Blue  blue = new Blue();
		//Orange orange = new Orange();

		//System.out.println(black());


	}

}
