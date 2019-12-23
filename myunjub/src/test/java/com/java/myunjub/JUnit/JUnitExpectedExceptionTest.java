package com.java.myunjub.JUnit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import org.junit.Test;

public class JUnitExpectedExceptionTest {
  @Test(expected = NoSuchFileException.class)
  public void expectException() throws IOException {
    Files.size(Paths.get("/no/file/exist.txt"));
  }
}
