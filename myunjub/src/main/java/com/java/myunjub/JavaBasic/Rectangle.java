package com.java.myunjub.JavaBasic;

public class Rectangle {

  private int weight;
  private int height;

  public Rectangle() {

  }

  public Rectangle(final int weight, final int height) {
    this.weight = weight;
    this.height = height;
  }

  public int area() {
    return weight * height;
  }
}
