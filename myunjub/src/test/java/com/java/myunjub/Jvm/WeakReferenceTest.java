package com.java.myunjub.Jvm;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class WeakReferenceTest {
  @Test
  public void weakReferenceStackManipulation() {
    final WeakReferenceStack<ValueContainer> stack = new WeakReferenceStack<>();
    final ValueContainer expected = new ValueContainer("Value for the stack");
    stack.push(new ValueContainer("Value for the stack"));
    ValueContainer peekedValue = stack.peek();
    assertEquals(expected, peekedValue);
    assertEquals(expected, stack.peek());
    peekedValue = null;
    System.out.println(stack.peek());
    System.gc();
    assertNull(stack.peek());
  }
  public class ValueContainer {
    private final String value;
    public ValueContainer(final String value) {
      this.value = value;
    }
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      System.out.printf("Finalizing for [%s]%n", toString());
    }

  }
}
