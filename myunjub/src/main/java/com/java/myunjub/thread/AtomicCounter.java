package com.java.myunjub.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
  private final AtomicInteger number = new AtomicInteger(0);
  public AtomicInteger getNumber() {
    return number;
  }
}
