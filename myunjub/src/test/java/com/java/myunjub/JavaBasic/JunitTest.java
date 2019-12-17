package com.java.myunjub.JavaBasic;

import junit.framework.TestCase;

public class JunitTest extends TestCase {

  private int myInt;

  public void setUp() {
    myInt = 42;
  }

  public void testmyIntValue() {
    assertEquals(42, myInt);
  }

  public void tearDown() {
    myInt = -1;
  }
}
