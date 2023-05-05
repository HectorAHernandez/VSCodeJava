package com.java_concepts.firstpackage;

public class CarClassV03 {
    String color;  //Global-instance variable.
	String model;  //Global-instance variable.
	int milage;    //Global-instance variable.
	double milage_d;    //Global-instance variable.
	//static int cost;  //Global-static variable. // Error "Only final permitted"
	//         When using static, the variable is going to use a constant value, not changing, for
	//         all the instances/objects created from the Class based on the last value in the
	//         last object created when the calling program is compiled. (the third one in program
	//         C06_ClassesUsingTheKeywordThis.
	int cost;  //Global-static variable. // Error "Only final permitted"

		
	// Constructors are method.
	// Similarities between constructors and methods
	// 		Methods							Constructors
	// 	--------------------------		------------------------------------------------
	//	- have their own name			- have the same name as the Class.
	//  - Have to be called by code 	- Are automatically executed when any object 
	//    to be executed.                 is created from the Class. because to create an object
	//                                	  we have to use the constructor of the type of object 
	//                                	  we want to create.
	//  - RETURN results or void.   	- DO NOT RETURN results.
	
	
	// First constructor for the Car Class:
	// One of the purpose of using constructors is to SIMPLIFY THE INITIALIZATION of Class/Global variables 
	
	// Method or Constructors Overloading Concept: In a Class definition, allows to define multiple methods
	//           with the same name inside the same Class as long as they differ in terms of the following:
	//       1- Different number of parameters.
	//       2- Different DataType of the parameters.
	//		 3- Different order of the parameters.
	
	// Overloading Example #1:
	public CarClassV03(String color, String model, int milage) {
		this.color = color;
		this.model = model;   // using the 'this.' keyword to identify from the parameter variables with same names.
		this.milage = milage;
		
		System.out.println("\nExample # 1 (number of Parms): CarClassV03 with only 3 parameters: color, model and milage");
	}	
	
	// Overloading Example #2:
	public CarClassV03(String color, String model, String milage) {
		this.color = color;
		this.model = model;   // using the 'this.' keyword to identify from the parameter variables with same names.
		this.milage = Integer.parseInt(milage);
		
		System.out.println("\nExample # 2 (Different DataType- milage String): CarClassV03 with only 3 parameters: color, model and milage-String");
	}	


	// Overloading Example #3:
	public CarClassV03(int milage, String color, String model) {
		this.color = color;
		this.model = model;   // using the 'this.' keyword to identify from the parameter variables with same names.
		this.milage = milage;
		
		System.out.println("\nExample # 3 (Different order in parms- milage first): CarClassV03 with only 3 parameters: milage, color and model");
	}	

	// Original Class definition
	public CarClassV03(String color, String model, int milage, int cost) {
		this.color = color;
		this.model = model;   // using the 'this.' keyword to identify from the parameter variables with same names.
		this.milage = milage;
		this.cost= cost;
		
		System.out.println("\nFirst Constructor executed");
		System.out.println("Original: CarClassV03 with only 4 parameters: color, model, milage and cost");
	}

	
	// Note: When a Class is created without a constructor, Java automatically creates 
	//       an Empty and Hidden constructor. This is why we can create objects from a Class that
	//       does not have a defined constructor:
	
	
	//		 public Car(){}       // Empty
	//        
	
	// Below methods, defined for this Class are Non-static method, therefore they are 
	// subject to java rule # 2:
	// JAVA RULE # 2:
	// 'Non-static method' can access both, static and non-static variable and methods.
	// This is Non-statics method can access Global-static and Global-instance variables
	// and static and Non-static methods.
	public void startCar() {
		System.out.println(model + " car started!!!");
	}
	
	public void stopCar() {
		System.out.println(model + " car stopped");
	}
	
	public void carDetails() {
		System.out.println("Color of car is " + color);
		System.out.println("Model of car is " + model);
		System.out.println("Milage of car is " + milage);
		System.out.println("The cost of car is " + cost);
	}

}