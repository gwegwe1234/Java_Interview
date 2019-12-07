package com.java.myunjub.designPattern.Decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

  public VerticalScrollBarDecorator(Window decoratedWindow) {
    super(decoratedWindow);
  }

  public void draw() {
    drawVerticalScrollBar();
    decoratedWindow.draw();
  }

  private void drawVerticalScrollBar() {
    System.out.println("Draw Vertical Scroll Bar");
  }

  public String getDescription() {
    return decoratedWindow.getDescription() + ", including vertical scrollbars";
  }
}
