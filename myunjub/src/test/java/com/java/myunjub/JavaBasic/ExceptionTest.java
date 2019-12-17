package com.java.myunjub.JavaBasic;

import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

public class ExceptionTest {

  private int addNumbers(int first, int second) {
    if(first > 42) {
      throw new IllegalArgumentException("First Parameter must be small");
    }

    return first + second;
  }

  @Test
  public void exceptionTest() {
    int total = 0;
    try {
      total = addNumbers(100, 25);
      System.out.println("total =" + total);
    } catch (IllegalArgumentException e) {
      throw new IllegalStateException("Unable to add numbers together", e);
    }
  }

  @Test
  public void demonstrateResourceHandling() {
    try(final FileReader reader = new FileReader("/tmp/filedata")) {
      final char[] buffer = new char[128];
      reader.read(buffer);
    }catch (IOException e) {
      e.printStackTrace();
    }
  }
}
