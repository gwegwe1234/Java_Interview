package com.java.myunjub.Jvm;

import java.util.Date;
import org.junit.Test;

public class ShutdownHookTest {

  @Test
  public void addShudownHook() {
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        System.err.println(
            "Shutting down JVM at time: " + new Date());
      }
    });
  }
}
