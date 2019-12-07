package com.java.myunjub.designPattern.Singleton;

public class Singleton {

  // 잘못된 예제
  private static Singleton INSTANCE;

  public static Singleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }

    return INSTANCE;
  }

  public void singletonMethod() {
    // operations here
  }

  // 제대로 된 예제
  public enum SingletonEnum {
    ENUM;

    public void singletonMethod() {
      // operations here
    }
  }
}