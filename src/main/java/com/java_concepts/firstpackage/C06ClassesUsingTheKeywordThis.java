package com.java_concepts.firstpackage;

public class C06ClassesUsingTheKeywordThis {
    	public static void main(String[] args) {
	
		CarClassV02 bmw = new CarClassV02("Brown", "A Special", 12, 25500);  //Here the Constructor is Simplifying the INITIALIZATION process 
		CarClassV02 honda = new CarClassV02("White", "Accourd", 21, 9500);
		CarClassV02 audi = new CarClassV02("Red", "Oceanic", 14, 31520);
		
		System.out.println("\n***** My BMW car details are: ");
		bmw.carDetails();
		System.out.println("\n***** My Audi car details are: ");
		audi.carDetails();
		System.out.println("\n***** My HOnda car details are: ");
		honda.carDetails();
				
	}

}
