package com.entertainment;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.setVolume(4);
    tv.setVolume(-42);
    tv.getVolume();
    tv.setBrand("hyundai");//error message
    tv.setBrand("Samsung");
    tv.setBrand("invalid name");
    System.out.println(tv);

  }
}
