package com.java.myunjub.Thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.myunjub.thread.AtomicCounter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;

public class AtomicSharedState {

  @Test
  public void atomicSharedState() {
    final ExecutorService executorService =
        Executors.newCachedThreadPool();
    final AtomicCounter c = new AtomicCounter();
    executorService.execute(new CounterSetter(c));
    final int value = c.getNumber().incrementAndGet();
    assertEquals(1, value);
  }

  private static class CounterSetter implements Runnable {

    private final AtomicCounter counter;

    private CounterSetter(AtomicCounter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      while (true) {
        counter.getNumber().set(0);
      }
    }
  }
}