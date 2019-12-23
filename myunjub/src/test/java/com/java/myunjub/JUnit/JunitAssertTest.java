package com.java.myunjub.JUnit;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class JunitAssertTest {
  @Test
  public void assertionWithMessage() {
    final List<Integer> numbers = new ArrayList<>();
    numbers.add(1);

    Assert.assertTrue("리스트가 비어있지 않음", numbers.isEmpty());
  }

  @Test
  public void assertionWithoutMessage() {
    final List<Integer> numbers = new ArrayList<>();
    numbers.add(1);

    Assert.assertTrue(numbers.isEmpty());
  }
}
