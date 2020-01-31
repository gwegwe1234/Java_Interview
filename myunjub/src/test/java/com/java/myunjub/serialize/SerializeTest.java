package com.java.myunjub.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

public class SerializeTest {

  @Test
  public void writeData() throws IOException {
    final FileOutputStream fos = new FileOutputStream("/Users/ted/file");
    final ObjectOutputStream oos = new ObjectOutputStream(fos);

    oos.writeInt(101);
    oos.writeBoolean(false);
    oos.writeUTF("Writing a string!");

    final Pair pair = new Pair(42, "forty tow");
    oos.writeObject(pair);

    oos.flush();
    oos.close();
    fos.close();
  }

  @Test
  public void readData() throws IOException, ClassNotFoundException {
    final FileInputStream fis = new FileInputStream("/Users/ted/file");
    final ObjectInputStream ois = new ObjectInputStream(fis);

    final int number = ois.readInt();
    final boolean bool = ois.readBoolean();
    final String string = ois.readUTF();
    final Pair pair = (Pair) ois.readObject();

    System.out.println(number);
    System.out.println(bool);
    System.out.println(string);
    System.out.println(pair);
  }

  @Test
  public void transientField() throws IOException, ClassNotFoundException {
    final User user = new User("Sunny", "Cindy");

    final FileOutputStream fos = new FileOutputStream("/Users/ted/file");
    final ObjectOutputStream oos = new ObjectOutputStream(fos);

    oos.writeObject(user);

    oos.flush();
    oos.close();
    fos.close();

    final FileInputStream fis = new FileInputStream("/Users/ted/file");
    final ObjectInputStream ois = new ObjectInputStream(fis);

    final User deserialized = (User) ois.readObject();

    System.out.println(deserialized.getUsername());
    System.out.println(deserialized.getPassword());
  }

}
