package org.alexgdev.codewars.sixkyu;
/*
 * https://www.codewars.com/kata/calculate-string-rotation/train/java
 */
public class CalculateRotation {
	  public static int shiftedDiff(String first, String second){
	    if(first.length() != second.length()){
	      return -1;
	    }
	    if(first.equals(second)){
	        return 0;
	      }
	    for(int i = 0; i<first.length();i++){
	      first = first.substring(first.length()-1)+first.substring(0,first.length()-1);
	      if(first.equals(second)){
	        return i+1;
	      }
	    }
	    return -1;
	  }
	  
	  
	}