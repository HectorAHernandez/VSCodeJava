package com.java_concepts.firstpackage;

public class C03ArraysMethodsVariable {
    	//Instance variables:
	int instance_var_1 = 555;
	double instance_var_2 = 222;
	
	//static variable:
	static String title_static_var = "This is from a static variable";
	static double tax_rate_static_var;

	public static void main(String[] args) {
		// Declare, Create, Assign, Access Arrays
		int a[] = new int[3];  // Declaration and Creation  (new) of an integer Array a with 3
		                       // elements.
		
		// Assigning the values to the Array elements
		a[0] = 5;
		a[1] = 98;
		a[2] = 48;
		
		// Accessing the Array Elements:
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		// Another way to declare an Array, with the [] beside the DataType
		int[] b;            // Declaration
		b = new int[2];     // Creation
		
		
		// Declearing, creating and assigning value to an Array, in a single line (shortcut):
		int[] c = {34, 7, 99, 78}; // The declaration is normal, use the brackets {} to indicate
		                           // create and the number element between the {} is the size of
		                           // the Array.
		                         
		// To Access the size of an Array we have to use the 'length' predefine variable or 
		// attribute of the Array variable
		System.out.println("Length of c Array --> " + c.length ); //4
		
		
		
		// For..each..loop are the best choice when we want to process the content of the 
		// whole Array. If we need to process only part of the content it is better using
		// the normal for..loop where we can operate on the index variable and stop/break the
		// process when ever we want.
		// Using for..loop to Access the content of an Array of integer DataType:
		for (int i=0; i < c.length; i++ ) {
			System.out.println("Array element(" + i + ") is " + c[i]);
		}
		
		System.out.println("");
		// Using for..each..loop to access the content of the Array:
		for (int var : c) {
			System.out.println("Using for-each-loop: c=" + var);
		}
		
		System.out.println();
		// Another for an Array of double DataType
		double[] dd = {23.89, 1.52, 714.9996};
		
		for (double d_var : dd) {
			System.out.println("for-each-loop on double DataType dd = " + d_var);
		}
		
		
		// ArrayIndexOutOfBoundException is generated when when we try to ASSIGN to and index
		// beyond the size of the Array. Or ACCESS and index beyond
		
		
		
		System.out.println("");
		System.out.println("** Two Dimensioal Array **");
		// Two dimensional Arrays:
		// Declaration and creation
		int[][] arrd2 = new int[2][3];   // first [] is for row, second[] for the column
		
		// Assigning values to a two dimensional Array:
		arrd2[0][0] = 4;
		arrd2[0][1] = 6;
		arrd2[0][2] = 8;
		arrd2[1][0] = 7;
		arrd2[1][1] = 46;
		arrd2[1][2] = 12;
		
		// Accessing the data in a two dimensional Array
		System.out.println("2-d Array = "+arrd2[0][1]);
		System.out.println("2-d Array = "+arrd2[0][2]);
		System.out.println("2-d Array = "+arrd2[1][0]);
		System.out.println("2-d Array = "+arrd2[1][2]);
		
		// Now using the shortcut:
		int[][] arr2d2 = {{4, 6, 8},{7, 46, 12}};

		// Accessing the data in the new two dimensional Array
		System.out.println("2-d with shortcut = "+arr2d2[0][1]);
		System.out.println("2-d with shortcut = "+arr2d2[0][2]);
		System.out.println("2-d with shortcut = "+arr2d2[1][0]);
		System.out.println("2-d with shortcut = "+arr2d2[1][2]);

		
		// finding the size of a Two dimensional Array. we have to determine the number of rows
		// and the number or rows independently:
		int number_rows = arrd2.length; // with the Array's name var we get the number of rows.
		int number_cols = arrd2[0].length; //Using any row .length we get the number of columns
		int number_cols2 = arrd2[1].length; //second row, must have same number of column
		
				// Now printing:
		System.out.println("arrd2.length - Number of rows -->" + number_rows);
		System.out.println("arrd2[0].length - Number of columns -->" + number_cols);
		System.out.println("arrd2[1].length - Same number of cols -->" + number_cols2);
		
		
		System.out.println();
		// Using For...loop to access a two dimensional Array:
		for (int row=0; row < arrd2.length; row++) {
			for (int col=0; col < arrd2[row].length; col++) {
				System.out.println("For-loop Array arrd2(" + row +","+ col +") = " + arrd2[row][col]);
			}
		}
		
		System.out.println(arrd2);  // in Java we CAN NOT print the whole array like we do in 
		                            // Python. it will display wild card characters
		//Output --> [[I@5b480cf9

	
		// We can create Array for the multiple Java Datatype:
		int[] integer_var = {3, 55, 6, 21};
		double[] double_var = {44.252, 2, 58.41};
		float[] float_var = {2.12f, 3.1416f, 8f};
		char[] char_var = {'a', '&', '3', 'R'};
		String[] string_var = {"Hector", "Amparo", "Selenium", "Java"};
		
		//Using the String Array:
		for (String str_var : string_var) {
			System.out.println("String Array content --> " + str_var);
		}
		
		//  ** Disadvantage of Arrays:
		// 1- Arrays are fixed size: Once it is created you cannot add a member after
		//    the last index. Array does not automatically grows. (note: collection Datatype
		//    solve this issue by allow to expand once it is created, like for example use the
		//    ArrayList)
		//
		// 2- Array does not accept value of a DataType different than the ones it was defined.
		//    int[], only accepts int values. Note: if we need to have values of multiple 
		//    Datatype we have to declase and create an 'Object type Array, example:
		Object[] obj_array = {1, 'v', 15.25, "Hector"};
		//    'Object' is a predefined/built-in Java Class. And Object is the parent of all 
		//             Classes in Java. Therefore it can contains elements of all of the others classes like:
		//             int, float, String, boolean. double,....
		for (Object obj_var : obj_array) {
			System.out.println("Object Array --> " + obj_var );
		}
		
		
		
		// METHODS:
		// Methods store the code or logic of a Class. The variables store the data of a Class.
		// Method's name starts with lowercase and later CamelCase.
		// any other method in the Class/program, different than the main(sring[] args) method, to execute
		// it most be called from inside the 'main' method. 
		// In a Java class the 'main' method is the entry point for execution of the Class.
		
		/*public class DemoClass {
		 * 
			public static void main(String[] args) {
				
				byte a = 127;   
			
				int aa = 5;
				System.out.println(aa%=2);
				
				boolean cc = (a >  b) ? true : false; // false --> false
				System.out.println("cc --> " + cc);
				
			}	
			
			public static void method_a(){
			   System.out.println("This is the additional method")
			
			}
		}
		 */
		
		method_a();  //calling a method
		method_b();
		method_one(52);
		method_two(34,"hector");
		
		
		// Returning values from methods to the method's calling statement:
		int result = addValues(5, 60);
		System.out.println("** Returned value from method addvalues --> "+ result);
		
		System.out.println(niceMessage());
		String also = niceMessage();
		System.out.println(also);
		
		
		
		// Variable types in Java: local, instance and static variable.
		// 1- Local variables are any variable declared inside any method. including the main(String[] args) method.
		
		// 2- Instance variables are any variable defined under the Class area and outside of any method in the 
		//    class, example instance_var_1 and instance_var_2 in lines 6 and 7 below class.
		//    for now, if we try to use an instance variable inside the Class code, we are receiving the error:
		//    "Cannot make a static reference to the non-static field instance_var_2":
		//    Note: I think because the instance variable are available or has scope outside the defining Class or
		//          when the class is instantiated to create a new object of the Class, this will be confirmed in
		//          next session:
		//         instance_var_2 = 499.99; // Error.
		//         System.out.println(instance_var_2);  // Error.   
		
		// 3- static variable: are instance variable (defined under Class and outside any method) but are 
		//    declared using the 'static' keyword. example, title_static_var and tax_rate_static_var, lines 10,11
		//    when declaring a variable as static, it expand the scope of the variable to be used in any method
		//    defined in the class.
		System.out.println("\n**** static variable, in main method --> " + title_static_var);
		title_static_var = "**** New title UPDATE inside the 'main' method ";
		method_b();
		
		
		
		
		// Variable Scope:
		// 1- Local variables can accessed only inside the scope of the method where they are declared. for 
		//    example, variable var_1_method_one CAN NOT be used in this main(String[], args) method, if so, we
		//    will get the error "var_1_method_one cannot be resolved to a variable".
		//    System.out.println(var_1_method_one);
		
		// 2- static variables can be accessed inside the class scope and any method defined in the class.
		method_c(); //In this method the static variable title_static_var is updated
		
	}
	
	public static void method_a(){
		   System.out.println("This is the additional method"); 
		   method_c();   // calling another method from inside this method.
	}
		
	public static void method_b(){
		   System.out.println("This is the additional method-bbbbbb");
		   System.out.println("\n**** static variable, in method_b method --> " + title_static_var);
	}
		

	public static void method_c(){
		   System.out.println("This is the additional method-cccc"); 
		   title_static_var = "New TITLE UPDATE INSIDE 'method_c' method ";
		   System.out.println(title_static_var );
	}
	
	public static void method_one(int parm_1) {
		int var_1_method_one = parm_1;
		System.out.println("This method_one using one parameter value = "+ var_1_method_one );
	}
	
	public static void method_two(int parm_1, String parm_2) {
		int age = parm_1;
		String name = parm_2 ;
		System.out.println("This method_one using one parameter Name: "+ name + " age: "+ age  );
	}
	
	public static int addValues(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static String niceMessage() {
		return "What a beautiful world we are living in 5D!!!!!!";
	}
	
    
}
