package org.alexgdev.codewars;

import static org.junit.Assert.*;

import org.alexgdev.codewars.fivekyu.DirectionReduction;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class DirectionReductionTest {

	@Test
	  public void testSimpleDirReduc() throws Exception {
	    assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
	        new String[]{"WEST"},
	        DirectionReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

	    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
	        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
	        DirectionReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
	  }

}
