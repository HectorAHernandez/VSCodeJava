package com.java_concepts.firstPackage;

import com.java_concepts.secondpackage.CarBasicAbstractClass;

public class CarAmerican extends CarBasicAbstractClass {

  @Override
  public void startFloating() {
    System.out.println("from abstract method: American car: start flying... ");
  }

  @Override
  public void stopFloating() {
    System.out.println("from abstract method: American car: stop flying.");
  }

  @Override
  public void startCar() {
    System.out.println("from abstract method: American car: Starting car...");
  }

  @Override
  public void startFlying() {
    System.out.println("from abstract method: American car: start flying...");
  }

  @Override
  public void stopFlying() {
    System.out.println("from abstract method: American car: stop flying.");
  }

  public void danceRockMusic() {
    System.out.println("American car dancing rock an roll...");
  }

  public void carOriginalWheels(int parmNumWheels) {
    System.out.println("The american car always has " + parmNumWheels);
  }
}
