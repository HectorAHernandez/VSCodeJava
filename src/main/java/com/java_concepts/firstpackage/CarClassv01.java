package com.java_concepts.firstpackage;

public class CarClassv01 {
    	String color;  //Global-instance variable.
	String model;  //Global-instance variable.
	int milage;    //Global-instance variable.
	static int cost;  //Global-static variable. // Error "Only final permitted"
	

	
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
	public CarClassv01(String parm_color, String parm_model, int parm_milage, int parm_cost) {
		color = parm_color;
		model = parm_model;
		milage = parm_milage;
		cost= parm_cost;
		
        System.out.println("First Constructor executed");
        System.out.println("Hector yes!!!!");
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
