package com.java.myunjub.Thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.myunjub.thread.SimpleCounter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;

public class LockedSharedState {

  @Test
  public void lockedSharedState() {
    final ExecutorService executorService =
        Executors.newCachedThreadPool();
    final SimpleCounter c = new SimpleCounter();
    executorService.execute(new CounterSetter(c));
    synchronized (c) {
      c.setNumber(200);
      assertEquals(200, c.getNumber());
    }
  }

  private static class CounterSetter implements Runnable {

    private final SimpleCounter counter;

    private CounterSetter(SimpleCounter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      while (true) {
        synchronized (counter) {
          counter.setNumber(100);
        }
      }
    }
  }
}
