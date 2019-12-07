package com.java.myunjub.designPattern;

import com.java.myunjub.designPattern.Decorator.HorizontalScrollBarDecorator;
import com.java.myunjub.designPattern.Decorator.SimpleWindow;
import com.java.myunjub.designPattern.Decorator.VerticalScrollBarDecorator;
import com.java.myunjub.designPattern.Decorator.Window;
import org.junit.Test;

public class DecoratorPatternTest {

  @Test
  public void decoratorPatternTest() {
    Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(
        new SimpleWindow()));
    decoratedWindow.draw();
    System.out.println(decoratedWindow.getDescription());
  }
}
