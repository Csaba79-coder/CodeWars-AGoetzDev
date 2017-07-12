package org.alexgdev.codewars.fivekyu;

/*
 * https://www.codewars.com/kata/common-denominators/train/java
 */
public class CommonDenominators {
	public static String convertFrac(long[][] lst) {
	      if(lst.length==0) return "";
	      long lcm = lst[0][1];
	      String result="";
	      for(int i=0; i<lst.length;i++){
	        lcm = getLCM(lcm, lst[i][1]);
	      }
	      for(int i=0; i<lst.length;i++){
	        
	        lst[i][0] = (lcm/lst[i][1])*lst[i][0];
	        lst[i][1] = lcm;
	        result+="("+lst[i][0]+","+lst[i][1]+")";
	      }
	      return result;
	      
	      
	      
	    
	    
	  }
	  
	  public static long getGCD(long a, long b){
	        if (b == 0) {
	            return a;
	        }
	        return getGCD(b, a % b);
	  }
	  
	  public static long getLCM(long a, long b){
	    return a * (b / getGCD(a, b));
	  }

}
