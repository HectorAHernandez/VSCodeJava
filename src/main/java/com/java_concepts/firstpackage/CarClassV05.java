// Class is a template to be used for creating objects.

package com.java_concepts.firstPackage;

public class CarClassV05 {

  String color; //Global-instance variable.
  String model; //Global-instance variable.
  double milage; //Global-instance variable.
  int cost; //Global-instance variable.
  static int numberOfWheels = 4; //static Common Variable, all car will

  //                                have 4 wheels

  // In the set of instance variables in a Class definition, a Common
  // variables is a variable that its value will be the same for all
  // the objects created out of the Class. example, number_of_wheels is
  // a Common variable in a Car Class.
  // Common variables has to be modified as 'static' to move them to the
  // Class level or saved in the class memory area.
  // All of the others (Non-Common) has to stay only 'Instance' variable or
  // that they are saved in the memory area of each created instance/object
  // from the class.

  // Instance variables are saved in the memory area that is created when
  // an object is instantiated/created using:
  //    Class_name obj_reference = new Class_name();
  // And therefore for accessing the values of instance variable we have to
  // use the 'obj_reference' pointer: obj_reference.model, obj_reference.cost

  // 'static' Common variables are saved in memory area that belong to the
  // Class definition, therefore to accessing the values of 'static'-Common
  // variables we have to use the Class_name:
  //           Example, Class_name.number_of_wheels.

  // Instance method:
  public void startCar() {
    System.out.println(model + " car started!!!");
  }

  // Instance method:
  public void stopCar() {
    System.out.println(model + " car stopped");
  }

  // Instance method:
  public static void carWheels() {
    System.out.println(
      "Inside-access: The number of wheels is:" + numberOfWheels
    );
    // Output: Inside-access: The number of wheels is:99999

    // From a inside the Class we CAN UPDATE the content of an
    // 'static'-Common-Class variable.
    numberOfWheels = 5;
    System.out.println(
      "\nInside the Class -access: changed NEW number of wheels is:" +
      numberOfWheels
    );
    // Output: Inside the Class -access: changed NEW number of wheels is:5
  }

  // Instance method:
  public void carDetails() {
    System.out.println("Color of car is " + color);
    System.out.println("Model of car is " + model);
    System.out.println("Milage of car is " + milage);
    System.out.println("The cost of car is " + cost);
  }
}
