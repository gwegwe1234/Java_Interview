package com.java.myunjub.JUnit;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class JUnitTestWithHamcrest {

  @Test
  public void useHamCrest() {
    final Integer a = 400;
    final Integer b = 300;

    assertThat(a, is(notNullValue()));
    assertThat(a, is(equalTo(400)));
    assertThat(b - a, is(greaterThan(0)));
  }
}
