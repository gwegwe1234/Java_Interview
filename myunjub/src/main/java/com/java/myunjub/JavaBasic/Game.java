package com.java.myunjub.JavaBasic;

public class Game {

  private final String name;
  private final int version;

  public Game(String name, int version) {
    this.name = name;
    this.version = version;
  }

  @Override
  public int hashCode() {
    return 44;
  }

  @Override
  public boolean equals(Object obj) {
    return obj.hashCode() == this.hashCode();
  }
}
