package org.alexgdev.codewars.fourkyu;

import java.util.regex.Pattern;
/*
 * https://www.codewars.com/kata/binary-multiple-of-3/train/java
 */
public class BinaryRegexp {

	  public static Pattern multipleOf3() {
	    // Regular expression that matches binary inputs that are multiple of 3
	    return Pattern.compile("((10(1|00)*01)|(0|11)*)*");
	  }
	  
	}
