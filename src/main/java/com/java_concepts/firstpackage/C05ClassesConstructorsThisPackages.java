package com.java_concepts.first_package;

public abstract class C05ClassesConstructorsThisPackages {
    	public static void main(String[] args) {
	
		CarClassV01 bmw = new CarClassV01("Brown", "A Special", 12, 25500);  //Here the Constructor is Simplifying the INITIALIZATION process 
		CarClassV01 audi = new CarClassV01("Red", "Oceanic", 14, 31520);
		CarClassV01 honda = new CarClassV01("White", "Accourd", 21, 9500);
		
		System.out.println("\n***** My BMW car details are: ");
		bmw.carDetails();
		System.out.println("\n***** My Audi car details are: ");
		audi.carDetails();
		System.out.println("\n***** My HOnda car details are: ");
		honda.carDetails();
				
	}

    
}
