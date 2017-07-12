package org.alexgdev.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.alexgdev.codewars.fivekyu.CommonDenominators;

public class CommonDenominatorsTest {

	@Test
	  public void test_fractions() throws Exception {
	    long[][] lst;
	    lst = new long[][] { {1, 2}, {1, 3}, {1, 4} };
	    assertEquals("(6,12)(4,12)(3,12)", CommonDenominators.convertFrac(lst));  
	  }

}
