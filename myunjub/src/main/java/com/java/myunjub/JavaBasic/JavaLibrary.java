package com.java.myunjub.JavaBasic;

public final class JavaLibrary {

  private String author;
  private String bookTitle;

  public JavaLibrary(String author, String bookTitle) {
    this.author = author;
    this.bookTitle = bookTitle;
  }

  public String getAuthor() {
    return author;
  }

  public String getBookTitle() {
    return bookTitle;
  }
}
