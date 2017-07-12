package org.alexgdev.codewars.sixkyu;

import java.util.*;

/*
 * https://www.codewars.com/kata/multi-tap-keypad-text-entry-on-an-old-mobile-phone/train/java
 */

public class Keypad {

  private Map<String,Button> bMap;

  public Keypad() {
        this.bMap = new HashMap<String, Button>();
        initButtons();
  }
  
  private void initButtons() {
        addButton(new Button("1"));
        addButton(new Button("ABC2"));
        addButton(new Button("DEF3"));
        addButton(new Button("GHI4"));
        addButton(new Button("JKL5"));
        addButton(new Button("MNO6"));
        addButton(new Button("PQRS7"));
        addButton(new Button("TUV8"));
        addButton(new Button("WXYZ9"));
        addButton(new Button("*"));
        addButton(new Button(" 0"));
        addButton(new Button("#"));
    }
    
  private void addButton(Button b) {
    for (char c : b.getChars().toCharArray()) {
     this.bMap.put(""+c, b);
    }
  }
  private Button getButton(String c) {
        return this.bMap.get(c);
  }

  public static int presses(String phrase) {
    int count = 0;
    phrase = phrase.replaceAll("[^a-zA-Z0-9*# ]", "").toUpperCase();
    Keypad keypad = new Keypad();
    for(char c : phrase.toCharArray()){
      count+=keypad.getButton(""+c).getPresses(c);
    }
    return count;
  }
}

class Button {
  private String chars;
  
  public Button(String label){
    this.chars = label;
  }
  public String getChars(){
    return this.chars;
  }
  public int getPresses(char c){
    return chars.indexOf(c)+1;
  }
}
