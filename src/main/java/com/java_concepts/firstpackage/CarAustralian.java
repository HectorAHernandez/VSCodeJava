package com.java_concepts.firstPackage;

import com.java_concepts.secondpackage.CarBasicAbstractClass;

public class CarAustralian extends CarBasicAbstractClass {

  @Override
  public void startFloating() {
    System.out.println(
      "from abstract method: Australian car: start FLOATING... "
    );
  }

  @Override
  public void stopFloating() {
    System.out.println("from abstract method: Australian car: stop FLOATING.");
  }

  @Override
  public void startCar() {
    System.out.println("from abstract method: Australian car: Starting car...");
  }

  @Override
  public void startFlying() {
    // This method does not need to be implemented in this class; but it is overridden
    // here to avoid error with abstract parent class. And this comment is needed to
    // avoid the warning message "UncommentedEmptyMethodBody"
  }

  @Override
  public void stopFlying() {
    // This method does not need to be implemented in this class; but it is overridden
    // here to avoid error with abstract parent class. And this comment is needed to
    // avoid the warning message "UncommentedEmptyMethodBody"
  }

  // abstract parent class

  public void jumpKangaroo() {
    System.out.println("Australian car jumping like a kangaroo...");
  }
}
