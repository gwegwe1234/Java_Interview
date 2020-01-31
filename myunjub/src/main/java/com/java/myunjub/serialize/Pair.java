package com.java.myunjub.serialize;

import java.io.Serializable;

public class Pair implements Serializable {
  private final int number;
  private final String name;

  public Pair(int number, String name) {
    this.name = name;
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
