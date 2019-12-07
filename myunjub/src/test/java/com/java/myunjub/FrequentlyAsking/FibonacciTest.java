package com.java.myunjub.FrequentlyAsking;

import static com.java.myunjub.FrequentlyAsking.Fibonacci.fibonacci;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibonacciList() {
    assertEquals(0, fibonacci(0).size());
    assertEquals(Arrays.asList(0), fibonacci(1));
    assertEquals(Arrays.asList(0, 1), fibonacci(2));
    assertEquals(Arrays.asList(0, 1, 1), fibonacci(3));
    assertEquals(Arrays.asList(0, 1, 1, 2), fibonacci(4));
    assertEquals(Arrays.asList(0, 1, 1, 2, 3), fibonacci(5));
    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), fibonacci(6));
    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), fibonacci(7));
    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacci(8));
  }
}
