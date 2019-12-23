package com.java.myunjub.JavaBasic;

import java.util.List;

public interface HighScoreService {
  List<String> getTopFivePlayers();
  boolean saveHighScore(int score, String playerNmae);
}
