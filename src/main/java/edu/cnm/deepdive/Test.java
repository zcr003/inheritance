package edu.cnm.deepdive;

public class Test {

  //This is an example of inheritance from the superclass, Gray Wolf.
  public static void main(String[] args) {
    GrayWolf buck;
    buck = new Dog();
    buck.vocalize();
    buck = new GrayWolf();
    buck.vocalize();
  }


}
