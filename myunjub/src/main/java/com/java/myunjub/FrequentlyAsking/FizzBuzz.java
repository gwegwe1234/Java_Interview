package com.java.myunjub.FrequentlyAsking;

import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class FizzBuzz {

  // version1
  public static List<String> fizzBuzz(final int n) {
    final List<String> toReturn = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        toReturn.add("FizzBuzz");
      } else if (i % 5 == 0) {
        toReturn.add("Buzz");
      } else if (i % 3 == 0) {
        toReturn.add("Fizz");
      } else {
        toReturn.add(Integer.toString(i));
      }
    }

    return toReturn;
  }

  // version 2
  public static List<String> alternativeFizzBuzz(final int n) {
    final List<String> toReturn = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      final String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");

      if (StringUtils.isEmpty(word)) {
        toReturn.add(word);
      } else {
        toReturn.add(word);
      }
    }

    return toReturn;
  }

  private static String toWord(final int divisor, final int value, final String word) {
    return value % divisor == 0 ? word : "";
  }
}
