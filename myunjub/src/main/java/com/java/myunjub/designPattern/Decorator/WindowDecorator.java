package com.java.myunjub.designPattern.Decorator;

public class WindowDecorator implements Window {

  protected Window decoratedWindow; // the Window being decorated

  public WindowDecorator(Window decoratedWindow) {
    this.decoratedWindow = decoratedWindow;
  }

  @Override
  public void draw() {
    // draw window
  }

  @Override
  public String getDescription() {
    return "Window Decorator";
  }
}
