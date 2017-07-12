package org.alexgdev.codewars;

import static org.junit.Assert.*;

import org.alexgdev.codewars.sixkyu.Keypad;
import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
      assertEquals(9, Keypad.presses("LOL"));
      assertEquals(13, Keypad.presses("HOW R U"));
    }
}