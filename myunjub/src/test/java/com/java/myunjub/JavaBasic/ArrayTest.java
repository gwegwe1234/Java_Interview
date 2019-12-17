package com.java.myunjub.JavaBasic;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

  @Test
  public void arraysAsObjects() {
    Map<String, Object> mapping = new HashMap<>();
    mapping.put("key", new int[]{0,1,2,3,4,5});
    Assert.assertTrue(mapping.get("key") instanceof int[]);
  }

  @Test
  public void arrayReference() {
    final int[] myArray = new int[]{1,2,3,4,5,6};
    int[] arrayReference2 = myArray;

    arrayReference2[5] = 99;
    Assert.assertTrue(myArray[5] == 99);
  }
}
