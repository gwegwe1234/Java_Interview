package com.java.myunjub.designPattern;

import com.java.myunjub.designPattern.Strategy.ConsoleGame;
import com.java.myunjub.designPattern.Strategy.GamePlayer;
import com.java.myunjub.designPattern.Strategy.Ps4;
import com.java.myunjub.designPattern.Strategy.Switch;
import org.junit.Test;

public class StrategyPatternTest {

  @Test
  public void strategyPatternPs4Test() {
    ConsoleGame consoleGame = new Ps4();
    GamePlayer gamePlayer = new GamePlayer(consoleGame);
    gamePlayer.playGame();
  }

  @Test
  public void strategyPatternSwitchTest() {
    ConsoleGame consoleGame = new Switch();
    GamePlayer gamePlayer = new GamePlayer(consoleGame);
    gamePlayer.playGame();
  }
}
