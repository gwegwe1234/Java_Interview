package com.java.myunjub.designPattern.Decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {

  public HorizontalScrollBarDecorator(Window decoratedWindow) {
    super(decoratedWindow);
  }

  public void draw() {
    drawHorizontalScrollBar();
    decoratedWindow.draw();
  }

  private void drawHorizontalScrollBar() {
    System.out.println("Draw Horizontal Scroll Bar");
  }

  public String getDescription() {
    return decoratedWindow.getDescription() + ", including horizontal scrollbars";
  }
}
