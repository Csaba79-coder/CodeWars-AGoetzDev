package org.alexgdev.codewars;

import static org.junit.Assert.*;

import org.alexgdev.codewars.fourkyu.BraceChecker;
import org.junit.Test;

public class BraceCheckerTests {

  private BraceChecker checker = new BraceChecker();

	@Test
	public void testValid() {
    assertEquals(true, checker.isValid("()"));
	}
  
  @Test
	public void testInvalid() {
    assertEquals(false, checker.isValid("[(])"));
	}

}