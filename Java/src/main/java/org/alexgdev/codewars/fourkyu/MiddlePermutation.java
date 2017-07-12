package org.alexgdev.codewars.fourkyu;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/*
 * https://www.codewars.com/kata/simple-fun-number-159-middle-permutation/train/java
 */
public class MiddlePermutation {
	private static List<String> permutations;
	  public static String findMidPerm(String strng) {
		  //sort string
		  int length = strng.length();
		  char[] chars = strng.toCharArray();
		  Arrays.sort(chars);
		  StringBuilder sb = new StringBuilder(length);
		  for (char c : chars) sb.append(c);
		  strng = sb.toString();

		  
		  sb = new StringBuilder(length);
	      BigDecimal goal = factorial(BigDecimal.valueOf(strng.length())).divide(BigDecimal.valueOf(2));
	      BigDecimal current = BigDecimal.ZERO;
	      int currentLength = length;
	      int index = 0;
	      BigDecimal currentFact;
	      while(sb.length() != length){
	    	  currentLength--;
	    	  currentFact = factorial(BigDecimal.valueOf(currentLength));
	    	  index = goal.subtract(current).divide(currentFact, BigDecimal.ROUND_CEILING).intValue();
	    	  sb.append(strng.charAt(index-1));
	    	  strng =strng.substring(0, index-1)+strng.substring(index);
	    	  current = current.add(currentFact.multiply(BigDecimal.valueOf(index-1)));
	      }
		  return sb.toString();
		  /*  Bruteforce
		  permutations = new ArrayList<String>();
	      permutate("",strng);
	      Collections.sort(permutations);
	      return permutations.get((permutations.size()/2)-1);
	      */
	        
	  }
		
		public static void permutate(String fix, String remaining){
			if(remaining.equals("")){
				permutations.add(fix);
			} else {
				for(int i=0; i<remaining.length();i++){
					permutate(fix+remaining.charAt(i), remaining.substring(0, i)+remaining.substring(i+1,remaining.length()));
				}
			}
		}
		
		public static BigDecimal factorial(BigDecimal n) {
			BigDecimal factorial = BigDecimal.valueOf(1);
		    if (n.equals(BigDecimal.valueOf(0))) {
		        return factorial;
		    }

		    for (int i = 1; i <= n.intValue(); i++) {
		        factorial = factorial.multiply(BigDecimal.valueOf(i));
		    }

		    return factorial;
		} 
}
