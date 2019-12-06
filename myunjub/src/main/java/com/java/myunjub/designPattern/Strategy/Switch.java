package com.java.myunjub.designPattern.Strategy;

public class Switch implements ConsoleGame {

  @Override
  public void turnOnGameConsole() {
    System.out.println("Switch turned on");
  }

  @Override
  public void turnOffGameConsole() {
    System.out.println("Switch turned off");
  }
}
