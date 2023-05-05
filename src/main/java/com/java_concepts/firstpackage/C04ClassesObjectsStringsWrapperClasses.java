package com.java_concepts.firstpackage;

public class C04ClassesObjectsStringsWrapperClasses {
    	// Global variables:
	static int a = 5;  //static variable
	int b = 9;  //Instance variable
	int c = 11;  //Instance variable
	
	//Objects should not be created outside the method. (or this area)
	

	public static void main(String[] args) {
		
		// Classes are Templates used to create objects. Objects are real world entities.
		// Objects should not be created outside the method.
		// A Class contains Variables and Methods.
		
		int x = 3; //local variable
		int y = 6; //local variable
		
		int sum = x + y + a;  // 'a' is an Global-static variable and therefore can be called in any method 
		                      // defined in the class. This CANNOT happens with Global-Instance variables.
		// Global-static variables can be used in this 'main' because this methos is 'static' and there is a
		// JAVA RULE # 1:
		// indicating that 'static method' only can access Global-static variables and static method,
		// therefore if we try to access a Global-Instance (no static) variable or call any method that is not
		// declared as 'static' this error will be displayed:
		// "Cannot make a static reference to the non-static field xxxx". 
		// NOte: By default the main(String[], args) method is defined as static!!!!
		
		// JAVA RULE # 2:
		// 'Non-static method' can access both, static and non-static variable and methods.
		// This is Non-statics method can access Global-static and Global-instance variables
		// and static and Non-static methods.
				
		System.out.println("Sum of local and static variables --> " + sum);
		
		
		// Object Creation Statement: 
		// Class_name object_name = new Class(); has two components: 
		// 1- The declaration: 'Class_name object_name'. Note: the object_name should be
		//    used to make reference to the attributes and methods declared in the Class.
		//    The class_name, will become the DataType of the object.
		// 2- The creation: new Class(), where 'new' is the operator to create and Class() is
		//    the Class constructor method. Note if the Class receives any parameter, then
		//    they should be passed here as Class(parm_1, parm_1...)
		// Example:
		CarClassv00 bmw = new CarClassv00();
		// here the object'sname 'bmw' is an Object-reference and  will be used as a 
		// reference to access the variables/properties and methods in memory of the just 
		// created Car object.
		
		// Creating another object for the Car Class
		CarClassv00 audi = new CarClassv00();
		
		
		// Initialize the just created object properties/attributes:
		bmw.color = "Green";
		bmw.model = "A Model";
		bmw.milage = 21;
		bmw.cost = 35000;
		
		audi.color = "Red";
		audi.milage = 41;
		audi.cost = 36500;
		audi.model = "Super Hybrid";
		
		
		// Accessing the method for each object:
		// audi:
		audi.startCar();
		audi.stopCar();
		audi.carDetails();
		
		System.out.println("The color of the 'audi' car is " + audi.color +
				" With a cost of : " + audi.cost );
		
		
		
		// Using the String class:
		String name = new String("Hector Amparo");
		
		//Primitive DataType: Are non-object DataType: int, boolean, double, long, char
		
		//Non-primitive DataType: Are Object oriented DataType: like String, Arrays
		// int[] var = new  int[3];
		// String name = new String("Hector Amparo");
		// or usign the shortcut: String name = "Hector Amparo";
		String firstname = "Hector";
		String space = " ";
		String lastname = "Amparo";
		
		String fullname = firstname + space + lastname ;
		System.out.println("Full name: " + fullname);
		
		// Using the .equals method to compare String variables:
		System.out.println("Hector".equals(firstname)); // true
		
		// For primitive DataType we can use == operator.
		
		// String .length method
		System.out.println(fullname.length()); //13
		
		// In String to get the length we use the length predefine method var.length()
		// In Arrays to get the length we use the length predefine attribute Arry.length
		
		
		// Using portion of a String, or substring: 
		// .substring(index) = get all character starting at index.
		name = "hector Amparo";
		//index 0123456789012
		System.out.println("name.subtring(7) --> "+ name.substring(7)); // Amparo
		// .substring(startingIndex, endingIndex) = get the characters from startingIndex
		//                         until endIndex minus one. 
		// if I want to get only Hector then .substring(0,6)
		System.out.println(name.substring(0, 6)); //hector
		// if I want to get only 'Ampa' then .substring(7,11)
		System.out.println(name.substring(7, 11)); // Ampa
		
		
		// Using the String .trim() method to Remove all space before and after the string
		// sequence in a String variable:
		name = "     hector Amparo    ";
		System.out.println(name.length()); // 22
		String trimmedname = name.trim();
		System.out.println(trimmedname.length()); // 13

		
		// If we need to know if a particular word is included in the content of a String
		// variable we can use the .indexOf('string') String method, if the 'string' is 
		// found in the content of the variable, then .indexof() method will return the 
		// index where it starts in the variable:
		String paragraph1 = "This is a sample text written by Hector for Java class";
		System.out.println(paragraph1);
		System.out.println(".indexOf(\"Hector\") --> "+paragraph1.indexOf("Hector")); //33
		// if the text is NOT FOUND, .indexof() method return the value -1:
		System.out.println(".indexof('ROCKET') --> " + paragraph1.indexOf("ROCKET")); // -1
		
		
		// .split() String method, return a String[] Array:
		String[] words = paragraph1.split(" ");
		for (String word: words) {
			System.out.println(word);
		}
		
		System.out.println("\n"
				+ "****");
		String paragraph_2 = "This-is-a-sample-text-written-by-Hector-for-Java-class";
		String[] words_2 = paragraph_2.split("-");
		for (String word: words_2) {
			System.out.println(word);
			// ****
			// This
			// is
			// a
			// sample
			// text
			// written
			// by
			// Hector
			// for
			// Java
			// class
		}
		
		
		// Wrapper Classes and Primitive DataType: for each primitive datatype there is 
		// a Wrapper Class:
		// Primitive  	Wrapper Class
		// int			Integer
		// short		Short
		// long			Long
		// float		Float
		// byte			Byte
		// double		Double
		// boolean 		Boolean
		// char			Character
		
		// Java is NOT A 100% Object oriented language because of the Primitive DataTypes.
		// All other thing in Java is an object, except the Primitive DataTypes.
		// Primitive DataType are non-object. 
		// In early days, memory was no so available in computer, therefore the Java 
		// creators, because objects consume a lot of memory, they decided to keep the 
		// primitive DataTypes as non-object.
		
		// There may be some situation where we could need to use the Primitives DataType 
		// as object, in this case we can use the Wrapper Class corresponding to the 
		// Primitive DataType.
		
		// How to convert Primitive DataType into Wrapper Classes:
		int a = 5;          // Define int Primitive DataType
		Integer int_object; // Define Wrapper Integer DataType
		int_object = a;     // Convert the primitive into a Wrapper Class Integer.
		System.out.println(a); //5
		System.out.println(int_object); //5
		 
		char aa = 'a';
		Character obj;
		obj = aa;
		System.out.println(aa);  //a
		System.out.println(obj); //a
		
		// Initializing Wrapper Class variable
		Character c_var = 'a';
		Integer i_var = 35;
		Short s_var = 21;
		Long l_var = 428l;
		Float f_var = 542.37f;
		Byte b_var = 8;
		Double d_var = 452.3698;
		Boolean bln_var = true;
		
		String str_ac = "100";
		System.out.println(str_ac + 15); //10015 concatenation because ac is String.
		
		// Using Wrapper Classes's methods, convert String variables into a primitive DataType:
		int int_ac = Integer.parseInt(str_ac);
		long lng_ac = Long.parseLong(str_ac);
		short sht_ac = Short.parseShort(str_ac);
		float flt_ac = Float.parseFloat(str_ac);
		byte byt_ac = Byte.parseByte(str_ac);
		double dbl_ac = Double.parseDouble(str_ac);
		
		String result = "true";
		boolean bln_result = Boolean.parseBoolean(result); // any value True/true will be
		// converted to boolena 'true', any other will be converted to boolean 'false'
		System.out.println(bln_result); //true
		System.out.println(!bln_result); //false
		
		// To convert String to any numeric DataType, the content of the String must be of
		// the numeric DataType only, this is not containing Alphabetic characters
		String nn = "123ABC";
		//int int_nn = Integer.parseInt(nn);  // This will generate the error Exception
		// NumberFormatException.java:67, because the String contains letters.
		// to fix the issue then we need to first, extract ONLY the digits, using the 
		// substring() method and then parsing to Integer.
		nn = nn.substring(0,3);
		int int_nn = Integer.parseInt(nn);  
		System.out.println(int_nn + 50);  //173
		
				
	}

    
}
