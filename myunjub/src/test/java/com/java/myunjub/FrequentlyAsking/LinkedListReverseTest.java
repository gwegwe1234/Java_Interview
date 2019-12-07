package com.java.myunjub.FrequentlyAsking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListReverseTest {

  @Test
  public void reverseLinkedList() {
    final LinkedList<String> three = new LinkedList<>("3", null);
    final LinkedList<String> two = new LinkedList<>("2", three);

    final LinkedList<String> one = new LinkedList<>("1", two);
    final LinkedList<String> reversed = LinkedListReverse.reverse(one);
    assertEquals("3", reversed.getElement());
    assertEquals("2", reversed.getNext().getElement());
    assertEquals("1", reversed.getNext().getNext().getElement());
  }
}
