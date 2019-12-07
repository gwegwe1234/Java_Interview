package com.java.myunjub.FrequentlyAsking;

public class LinkedListReverse {

  public static <T> LinkedList<T> reverse(final LinkedList<T> original) {
    if (original == null) {
      throw new NullPointerException("Cannot reverse a null list");
    }
    if (original.getNext() == null) {
      return original;
    }
    final LinkedList<T> next = original.next;
    original.next = null;
    final LinkedList<T> othersReversed = reverse(next);
    next.next = original;
    return othersReversed;
  }
}
