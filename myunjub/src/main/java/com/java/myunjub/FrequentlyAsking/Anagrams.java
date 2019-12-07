package com.java.myunjub.FrequentlyAsking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

  final Map<String, List<String>> lookup = new HashMap<>();

  public Anagrams(final List<String> words) {
    for (final String word : words) {
      final String signature = alphabetize(word);
      if (lookup.containsKey(signature)) {
        lookup.get(signature).add(word);
      } else {
        final List<String> anagramList = new ArrayList<>();
        anagramList.add(word);
        lookup.put(signature, anagramList);
      }
    }
  }

  private String alphabetize(final String word) {
    final byte[] bytes = word.getBytes();
    Arrays.sort(bytes);
    return new String(bytes);
  }

  public List<String> getAnagrams(final String word) {
    final String signature = alphabetize(word);
    final List<String> anagrams = lookup.get(signature);
    return anagrams == null ? new ArrayList<String>() : anagrams;
  }

  public static void main(String args[]) {
    List<String> temp = new ArrayList();
    temp.add("abcd");
    temp.add("bcda");
    temp.add("aaaa");
    Anagrams a = new Anagrams(temp);
    System.out.println(a.getAnagrams("abcd"));
    System.out.println("abcd");
  }
}


