package com.java_concepts.first_package;

import com.java_concepts.login.LoginOpened;
//import com.java_concepts.login.LoginRestricted;

import com.java_concepts.photos.AddPhoto;

public abstract class C11ClassesModifiers {
	
	static String name_static = "Hector Static";

	public static void main(String[] args) {
		
		// Modifiers can be applied to: Class, Variables and Methods; to 
		// CHANGE/Modify the original PROPERTIES and
		// behaviors of the Class, Variables and Methods.
		// Types of Modifiers:
		// Access Modifiers				Non-Access Modifiers
		// ----------------             --------------------
		// 1- public					1- static
		// 2- private					2- final
		// 3- default                   3- abstract
		// 4- protected					
		
		// A C C E S S   M O D I F I E R S:
		// Every modifier is a java keyword; but the default, it does not need to be
        // specified.
		
		// 2- private modifier: can be applied to Variables and Methods. private CANNOT
		// be applied to Class.
		//    private modifier allows access to the Variables and methods By only OTHER
		//    Methods that are defined/declared inside of the Same Class where the 
		//    private Variables and Methods are declared.
		//    private modifier indicate that the variables/methods are private to the 
		//    Methods declared in the Class.

		// Example: To access the variables and Methods defined in the LoginRestricted
		// Class, we have to create an object of the LoginRestricted class:
		// LoginRestricted loginObj = new LoginRestricted(); // The LoginRestricted class
		                                        //is public, therefore we have access.
		
		// Now if we try to access its private Variables and method then we won't be 
		// able, because the method and variables are declared as 'private' in the
		// LoginRestricted.java Class:
		// loginObj.loginToApplication(); //-- Error "Change Visibility of 
		//    'loginToApplication()' to 'public'"
		// --> logged_user = loginObj.user_name; -- Error "Change Visibility of
		//     'user_name' to 'public'"
		
		// 1- public modifier: can be applied to Class, Variables and Methods. 
		//    public modifier allows access to the Class, variables and methods
		// from any other method that is declared/defined inside/outside the class 
		// where the 'public' variables and methods are defined/declared.
		//    public modifier indicate that the variables/methods are public to the 
		// Methods declared in any Class.
		
		// Example: To access the variables and Methods defined in the LoginOpened Class, we 
		// have to create an object of the LoginOpened class:
		LoginOpened loginObj2 = new LoginOpened();
		loginObj2.loginToApplication();
		System.out.println("Logged User: " + loginObj2.userName);
		System.out.println("Password: " + loginObj2.password);
		
		
		// In order to use Variable and method from Class that is defined in
		// another package we have to 'import' the Class from that package 
		// first and then creating/instantiating objects of that class, see
		// line #6 above. Importing the class is like obtaining permission to 
		// access the public variables/methods in the imported class.
		AddPhoto addPhotoObj = new AddPhoto();
		addPhotoObj.addPhotoHD();
		System.out.println("Photographer: " + addPhotoObj.taken_by + 
				" On: " + addPhotoObj.day_of_week);
		
		// 3- default modifier: is not a keyword, the default modifier is 
		//    activated when no modifier (public, private, protected) is 
		// specified for a Class, variable or method.
		// The meaning of the default modifier:
		// public --> For all the classes declared/defined in the same package.
		// private -> For all the classes declared in another/outside the 
		//            package
		// Example of Accessing a 'default' class as 'public', for this the 
		// calling class must be declared in the same package. See the 
		// CallingDefaulAsPublic in package 'login': 
		
		// Now another as 'public' example having the class 'LoginDefaultInThisPackage'
		// declared in this same package 'firstpackage'
		LoginDefaultInThisPackage loginObj3 = new LoginDefaultInThisPackage();
		
		String pwd = loginObj3.password;
		String user = loginObj3.user_name;
		System.out.println("\nUser: " + user + " password: " + pwd);
		
		loginObj3.loginToApplication();
		

		// Example of trying accessing a 'default' class from a class in a different
		// package, the default will be as 'private'. It will be as 'private' no 
		// matter if the calling class extends/inherits the class. For this the 
		// calling class that is declared in a different package. See the 
		// LoginDefault class in package 'login': In this case, not even the
		// object will be allowed to be created/instantiated because the default
		// class is 'private' to this Calling class because both are in 
		// different packages:
		// LoginDefault loginObje = new LoginDefault();
		// Above get this error:  LoginDefault cannot be resolved to a type.
		
		
		
		// 4- protected modifier: is a keyword, the 'protected' modifier can be
		// specified for a Class, variable or method.
		// The meaning of the 'protected' modifier:
		// public --> For all the classes declared/defined in the same package.
		// private -> For all the classes declared in another/outside the 
		//            package. Except, if the class is extending/inheriting/is
		//            a child of the class using the 'protected' modifier. 
		// The 'protected' modifier is in place to allow protected access to child
		// classes/inheriting/extending classes in another package. 
		// Example of Accessing a 'protected' class as 'public', for this the 
		// calling class must be declared in the same package. See the 
		// CallingProtectedAsPublic in package 'login': 
		
		// Now another as 'public' example having the class 'LoginProtectedInThisPackage'
		// declared in this same package 'firstpackage'
		LoginProtectedInThisPackage loginObj4 = new LoginProtectedInThisPackage();
				
		String pwd4 = loginObj4.password;
		String user4 = loginObj4.user_name;
		System.out.println("\nUser: " + user4 + " password: " + pwd4);
		
		loginObj4.logintoApplication();
		

		// Example of trying accessing a 'protected' class from a class in a different
		// package, the 'protected' will be as 'private'. For this the 
		// calling class that is declared in a different package. See the 
		// LoginProtected class in package 'login': In this case, not even the
		// object will be allowed to be created/instantiated because the 'protected'
		// class is 'private' to this Calling class because both are in 
		// different packages:
		// LoginProtected loginObje = LoginProtected();
		// Above get this error:  LoginDefault cannot be resolved to a type.
		
		// But... A 'protected' behaves as 'public' when in different packages
		//        but the calling class extends/inherits as a child:
		
		// Now if we try to use the LoginProtected class (in login package) 
		// when inheriting or extending it as a parent in a class in a different
		// package (firstpackage) then ACCESS IS ALLOWED, see 
		// UsingLoginProtectedFromAChild
		UsingLoginProtectedFromAChild loginObj5 = new UsingLoginProtectedFromAChild();
		loginObj5.loginProtectedFromChild();
		
		
		
		
		
		// NON-A C C E S S   M O D I F I E R S: static, final, abstract
		// 1- static modifier: Only Can use used with variables and method. Not
		//                  for Class definition. When using 'static' modifiers
		// we have to keep in mind Java Rule #1: "Static" methods can only 
		// access static variables and methods"
		
		// Variables declared directly inside the class  but outside the method
		// and are specified with 'static' modifier are known as static 
		// variables.
		
		System.out.println("before: name_static --> " + name_static);
		name_static = "Changed Static variable";
		System.out.println("after: name_static --> " + name_static);

		// Variables declared inside any method are known as 'local' variables
		// and 'local' variables CAN NOT be modified as 'static'or 
		// 'abstract'. ONLY 'final'

		String localVariable = "I am local";
		System.out.println(localVariable);
		
		// In the set of instance variables in a Class definition, a Common
		// variables is a variable that its value will be the same for all 
		// the objects created out of the Class. example, number_of_wheels is
		// a Common variable in a Car Class. 
		// Common variables has to be modified as 'static'.
		// All of the others (Non-Common) has to stay only 'Instance' variable
		
		// Instance variables are saved in the memory area that is created when
		// an object is instantiated/created using: 
		//    Class_name obj_reference = new Class_name();
		// And therefore for accessing the values of instance variable we have to
		// use the 'obj_reference' pointer: obj_reference.model, obj_reference.cost
		
		// 'static' Common variables are saved in memory area that belong to the
		// Class definition, therefore to accessing the values of 'static'-Common
		// variables we have to use the Class_name: 
		//           Example, Class_name.number_of_wheels.

		// Example accessing instance/object variables and methods:
		CarClassV05 bmw = new CarClassV05();
			
		// Initialize the just created object properties/attributes:
		bmw.color = "Green";
		bmw.model = "A Model";
		bmw.milage = 21;
		bmw.cost = 35000;
		
		// Creating another object for the Car Class
		CarClassV05 audi = new CarClassV05();
		audi.color = "Red";
		audi.milage = 41;
		audi.cost = 36500;
		audi.model = "Super Hybrid";
		
		// instance/object methods are accessed with the obj_reference:
		bmw.startCar();
		bmw.stopCar();
		audi.startCar();
		audi.stopCar();
		
		
		
		// Accessing 'static'-Common-Class variable and methods: we have to 
		// use the Class_name:
		// int carNoWheels = CarClassV05.numberOfWheels;
		
		System.out.println("\nOutside-access: Class Number of Wheels: " 
		+ CarClassV05.numberOfWheels);
		// Output: Class Number of Wheels: 4

		// From a calling Class we CAN UPDATE the content of an 
		// 'static'-Common-Class variable. 
		CarClassV05.numberOfWheels = 99999;
		System.out.println("\nOutside-access: UPDATED Class Number of Wheels: " 
		+ CarClassV05.numberOfWheels);
		// Output: UPDATED Class Number of Wheels: 99999
		
		// 'static'-Common-Class methods are accessed with the Class_name:
		CarClassV05.carWheels();
		
		
		// 2- 'final' modifier: Can use used with all, Class, variables and 
		//     method. 
		// - final at Class Level: When the 'final' modifier on a Class declaration, then
		// that Class CAN NOT be INHERITED.
		
		// - final at variable level: When the 'final' modifier on a variable 
		// declaration and assign a value, then that variable value CAN NOT 
		// be CHANGED any where (this is inside or out side the class).
		
		// - final at method level: When the 'final' modifier on a method 
		// declaration then that method CAN NOT be OVERRIDEN in any child 
		// class. 
		

		// 3- 'abstract' modifier: Can use used with all, Class, variables and 
		//     method. 
		
		// - 'abstract' at Class level: when used in a Class declaration, then
		//    the Class can contains both 'abstract' and 'NON-abstract" methods
		
		// - 'abstract' at method level: when used in a method, the method
		//    CAN NOT have a body: This is, it has to be declared as this:
		//          public abstract void startCar();  --> without {body}
		//   'abstract' method CAN ONLY be declared in an 'abstract' Class:
		
		// public abstract class Car {
		//    public abstract void startCar();
	    // }
		
		// NOTE: WE CANNOT CREATE OBJECTS FROM abstract Classes. Therefore,
		//      the only way to access the methods (abstract and NON-abstract)
		//      in an 'abstract' class is by creating another Class that
		//      INHERIT the 'abstract' class. BUT this Child class HAS TO 
		//      IMPLEMENT THE 'abstract' methods in the 'abstract' Class.
        //      Then we can create objects of the created Child class.
		CarClassV06ChildClassEurope euroCar = new CarClassV06ChildClassEurope();
		euroCar.startCar();
		euroCar.stopCar();
		
	}
	
}














