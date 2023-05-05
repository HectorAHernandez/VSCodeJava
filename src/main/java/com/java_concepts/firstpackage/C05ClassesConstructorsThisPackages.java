package com.java_concepts.firstpackage;

public class C05ClassesConstructorsThisPackages {
    	public static void main(String[] args) {
	
		CarClassv01 bmw = new CarClassv01("Brown", "A Special", 12, 25500);  //Here the Constructor is Simplifying the INITIALIZATION process 
		CarClassv01 audi = new CarClassv01("Red", "Oceanic", 14, 31520);
		CarClassv01 honda = new CarClassv01("White", "Accourd", 21, 9500);
		
		System.out.println("\n***** My BMW car details are: ");
		bmw.carDetails();
		System.out.println("\n***** My Audi car details are: ");
		audi.carDetails();
		System.out.println("\n***** My HOnda car details are: ");
		honda.carDetails();
				
	}

    
}
