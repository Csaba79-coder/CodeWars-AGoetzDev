package org.alexgdev.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.alexgdev.codewars.sixkyu.CalculateRotation;
import org.junit.runners.JUnit4;


public class CalculateRotationTest {
    @Test
    public void test() {
      assertEquals(-1, CalculateRotation.shiftedDiff("hoop","pooh"));
      assertEquals(2, CalculateRotation.shiftedDiff("coffee","eecoff"));
      assertEquals(4, CalculateRotation.shiftedDiff("eecoff","coffee"));
    }
}
