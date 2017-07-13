package org.alexgdev.codewars.fivekyu;

/*
 * https://www.codewars.com/kata/human-readable-time/train/java
 */
public class HumanReadableTime {
	  public static String makeReadable(int seconds) {
	    return String.format("%02d:%02d:%02d", seconds/3600, seconds%3600/60, seconds%60);
	  }
	}
