package edu.cnm.deepdive;

public class Dog extends GrayWolf {

  //invokes the superclass method
  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }
}
