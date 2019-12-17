package com.java.myunjub.JavaBasic;

import org.junit.Assert;
import org.junit.Test;

public class StaticExampleTest {

  @Test
  public void staticTest() {
    Assert.assertEquals(10, StaticExample.staticValue );
    StaticExample staticExample = new StaticExample();
    StaticExample staticExample1 = new StaticExample();

    staticExample.staticValue = 100;

    Assert.assertEquals(100, staticExample1.staticValue );
  }
}
