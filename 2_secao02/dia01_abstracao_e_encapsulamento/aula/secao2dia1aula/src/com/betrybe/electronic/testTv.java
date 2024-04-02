package com.betrybe.electronic;

import com.betrybe.electronic.Television;

public class testTv {

  public static void main(String[] args) {
    Television tv = new Television("LG", "HD-LED", 56);
//    tv.volume = 100;
//    tv.volume = -1;
    tv.turnOn();
    tv.turnOff();
  }
}
