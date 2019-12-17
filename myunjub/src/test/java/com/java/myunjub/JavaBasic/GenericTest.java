package com.java.myunjub.JavaBasic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericTest {
  private List<Author> authors;

  public class Author {
    private final String name;

    private Author(final String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  @Before
  public void createAuthors() {
    authors = new ArrayList();

    authors.add(new Author("Park"));
    authors.add(new Author("Lee"));
    authors.add(new Author("Kim"));
  }

  @Test
  public void authorListAccess() {
    final Author author = authors.get(2);
    Assert.assertEquals(author.getName(), "Kim" );
  }

  @Test
  public void usePushAll() {
    final ArrayList<Rectangle> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(new Rectangle());
    }

    final GenericStack<Rectangle> genericStack = GenericStack.pushAll(list);

    Assert.assertNotNull(genericStack.pop());
  }

  @Test
  public void usePushAllWithSquare() {
    final ArrayList<Square> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(new Square(3));
    }

    final GenericStack<Rectangle> genericStack = GenericStack.pushAll(list);

    Assert.assertNotNull(genericStack.pop());
  }
}
