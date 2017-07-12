package org.alexgdev.codewars.sixkyu;

/*
 * https://www.codewars.com/kata/take-a-ten-minute-walk/train/java
 */
public class TenMinWalk {
	  public static boolean isValid(char[] walk) {
	    if(walk.length != 10){
	      return false;
	    }
	    int up = 0;
	    int side = 0;
	    for(int i = 0; i<walk.length;i++){
	      switch(walk[i]){
	        case 'n':  up++;
	                   break;
	        case 's':  up--;
	                   break;
	        case 'w':  side++;
	                   break;
	        case 'e':  side--;
	                   break;
	        default:   break;        
	      }
	    }
	    if(up == 0 && side == 0){
	      return true;
	    }
	    return false;
	  }
	}
