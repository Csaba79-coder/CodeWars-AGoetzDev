package org.alexgdev.codewars.sixkyu;

/*
 * https://www.codewars.com/kata/valid-phone-number/train/java
 */
public class ValidPhoneNumber {
	  public static boolean validPhoneNumber(String phoneNumber) {
	      return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");

	  }
	}