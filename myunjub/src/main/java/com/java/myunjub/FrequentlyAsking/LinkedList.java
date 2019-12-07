package com.java.myunjub.FrequentlyAsking;

public class LinkedList<T> {
  private T element;
  public LinkedList<T> next;
  public LinkedList(T element, LinkedList<T> next) {
    this.element = element;
    this.next = next;
  }
  public T getElement() {
    return element;
  }
  public LinkedList<T> getNext() {
    return next;
  }
}
