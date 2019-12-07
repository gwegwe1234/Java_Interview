package com.java.myunjub.designPattern.Decorator;

public class SimpleWindow implements Window {

  @Override
  public void draw() {
    System.out.println("Draw Simple Window");
  }

  @Override
  public String getDescription() {
    return "Simple Window";
  }
}
