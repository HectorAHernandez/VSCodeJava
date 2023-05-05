package com.java_concepts.firstpackage;

public class CarClassv00 {
    String color;  //Global-instance variable.
	String model;  //Global-instance variable.
	int milage;    //Global-instance variable.
	static int cost;  //Global-static variable. // Error "Only final permitted"

	
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
