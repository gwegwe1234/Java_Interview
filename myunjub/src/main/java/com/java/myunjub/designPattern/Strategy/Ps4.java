package com.java.myunjub.designPattern.Strategy;

public class Ps4 implements ConsoleGame {

  @Override
  public void turnOnGameConsole() {
    System.out.println("PS4 turned on");
  }

  @Override
  public void turnOffGameConsole() {
    System.out.println("PS4 turned off");
  }
}
