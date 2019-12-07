package com.java.myunjub.FrequentlyAsking;

public class StringReverse {

  public static String reverse(final String s) {
    final StringBuilder builder = new StringBuilder(s.length());
    for (int i = s.length() - 1; i >= 0; i--) {
      builder.append(s.charAt(i));
    }
    return builder.toString();
  }

  public static String inPlaceReverse(final String s) {
    final StringBuilder builder = new StringBuilder(s);
    for (int i = 0; i < builder.length() / 2; i++) {
      final char tmp = builder.charAt(i);
      final int otherEnd = builder.length() - i - 1;
      builder.setCharAt(i, builder.charAt(otherEnd));
      builder.setCharAt(otherEnd, tmp);
    }
    return builder.toString();
  }
}
