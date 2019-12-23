package com.java.myunjub.JavaBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class UseObject {
  @Test(expected = NullPointerException.class)
  public void expectNullPointerExceptionToBeThrown() {
    final String s = null;
    final int stringLength = s.length();
  }

  @Test
  public void callByValueTest() {
    int i = 10;
    int j = i;
    j = j + 10;
    Assert.assertEquals(10, i);
    Assert.assertEquals(20, j);
  }

  @Test
  public void callByReference() {
    List<String> myList = new ArrayList<>();
    myList.add("테스트 값");
    Assert.assertTrue(myList.size() == 1);

    List<String> myList2 = myList;
    myList2.add("두번째 테스트 값");
    Assert.assertTrue(myList.size() == 2);
  }

  @Test
  public void finalReferenceTest() {
    final int i = 42;
    //i = 43; // 컴파일 에러 발생

    final List<String> list = new ArrayList<>();
    //list = new ArrayList<>(); // 컴파일 에러 발생
  }

  @Test
  public void ineritanceTest() {
    List<Rectangle> list = new ArrayList<>();
    list.add(new Rectangle(5, 1));
    list.add(new Rectangle(4, 3));
    list.add(new Square(9));

    Assert.assertEquals(list.get(0).area(), 5);
    Assert.assertEquals(list.get(1).area(), 12);
    Assert.assertEquals(list.get(2).area(), 81);

  }

  @Test
  public void wrongSetBehavior() {
    final Set<GameCD> people = new HashSet<>();

    final GameCD gameCD1 = new GameCD("Archer", 3);
    final GameCD gameCD2 = new GameCD("Archer", 3);

    Assert.assertEquals(gameCD1, gameCD2);
  }
}
