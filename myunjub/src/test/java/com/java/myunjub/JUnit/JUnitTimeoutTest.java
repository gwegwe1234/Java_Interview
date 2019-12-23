package com.java.myunjub.JUnit;

import org.junit.Test;

public class JUnitTimeoutTest {

  @Test(timeout = 1000L)
  public void serviceResponseTime() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
