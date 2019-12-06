package com.java.myunjub.designPattern.Strategy;

public class GamePlayer {

  private ConsoleGame consoleGame;

  public GamePlayer(ConsoleGame consoleGame) {
    this.consoleGame = consoleGame;
  }

  public void playGame() {
    consoleGame.turnOnGameConsole();
    System.out.println("게임을 한다.");
    consoleGame.turnOffGameConsole();
  }
}
