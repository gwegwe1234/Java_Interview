package com.java.myunjub.JavaBasic;

import org.junit.Assert;
import org.junit.Test;

public class MinInt {

  @Test
  public void absoluteOfMostNegativeValue() {
    final int mostNegative = Integer.MIN_VALUE;
    final int negated = Math.abs(mostNegative);
    Assert.assertFalse("민밸류 절대값따윈 없다", negated > 0);
  }
}
