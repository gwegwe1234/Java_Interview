package com.java.myunjub.JUnit;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;

public class JUnitLifeCycle {

  private static int counter = 0;

  @BeforeClass
  public static void suiteSetup() {
    Assert.assertEquals(0, counter);
    counter++;
  }

  public JUnitLifeCycle() {
    Assert.assertTrue(Arrays.asList(1, 5).contains(counter));
    counter++;
  }

  @Before
  public void prepareTest() {
    Assert.assertTrue(Arrays.asList(2, 6).contains(counter));
    counter++;
  }

  @Test
  public void performFirstTest() {
    Assert.assertTrue(Arrays.asList(3, 7).contains(counter));
    counter++;
  }

  @Test
  public void performSecondTest() {
    Assert.assertTrue(Arrays.asList(3, 7).contains(counter));
    counter++;
  }

  @After
  public void cleanUpTest() {
    Assert.assertTrue(Arrays.asList(4, 8).contains(counter));
    counter ++;
  }

  @AfterClass
  public static void suiteFinished() {
    Assert.assertEquals(9, counter);
  }
}
