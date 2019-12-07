package com.java.myunjub.designPattern;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FlyWeightPatternTest {

  @Test
  public void sameIntegerInstances() {
    final Integer a = Integer.valueOf(56);
    final Integer b = Integer.valueOf(56);

    assertSame(a,b);

    final Integer c = Integer.valueOf(472);
    final Integer d = Integer.valueOf(472);

    assertNotSame(c,d);
  }
}
