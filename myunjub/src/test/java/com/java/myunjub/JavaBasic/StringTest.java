package com.java.myunjub.JavaBasic;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {
  @Test
  public void arrayReference() {
    String hello1 = new String("Hello World!");
    String hello2 = "Hello World!";

    Assert.assertEquals(hello1, hello2 );
  }
}
