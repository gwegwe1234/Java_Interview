package com.java.myunjub.FrequentlyAsking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

  public static List<Integer> fibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException(
          "n must not be less than zero");
    }
    if (n == 0) {
      return new ArrayList<>();
    }
    if (n == 1) {
      return Arrays.asList(0);
    }
    if (n == 2) {
      return Arrays.asList(0, 1);
    }
    final List<Integer> seq = new ArrayList<>(n);
    seq.add(0);
    n = n - 1;
    seq.add(1);
    n = n - 1;
    while (n > 0) {
      int a = seq.get(seq.size() - 1);
      int b = seq.get(seq.size() - 2);
      seq.add(a + b);
      n = n - 1;
    }
    return seq;
  }

  public static int fibN(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must not be less than zero");
    }

    if (n == 1) {
      return 1;
    }

    if (n == 0) {
      return 0;
    }

    return (fibN(n - 1) + fibN(n - 2));
  }

  private Map<Integer, Integer> fibCache = new HashMap<>();

  public int cachedFibN(int n) {
    if (n < 0) {
      throw new IllegalArgumentException(
          "n must not be less than zero");
    }
    fibCache.put(0, 0);
    fibCache.put(1, 1);
    return recursiveCachedFibN(n);
  }

  private int recursiveCachedFibN(int n) {
    if (fibCache.containsKey(n)) {
      return fibCache.get(n);
    }
    int value = recursiveCachedFibN(n - 1) + recursiveCachedFibN(n - 2);
    fibCache.put(n, value);
    return value;
  }
}
