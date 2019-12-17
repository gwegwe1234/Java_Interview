package com.java.myunjub.JavaBasic;

import java.util.LinkedList;
import java.util.List;

public class GenericStack<E> {
  private final List<E> values;

  public GenericStack() {
    values = new LinkedList<E>();
  }

  public void push(final E element) {
    values.add(0, element);
  }

  public E pop() {
    if (values.size() == 0) {
      return null;
    }

    return values.remove(0);
  }

  public static GenericStack<Rectangle> pushAll(final List<? extends Rectangle> listOfRectangle) {
    final GenericStack<Rectangle> stack = new GenericStack<>();
    for (Rectangle r : listOfRectangle) {
      stack.push(r);
    }

    return stack;
  }
}
