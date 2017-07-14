package org.alexgdev.codewars.fourkyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfDivided {
	  public static String sumOfDivided(int[] l) {
	    List<Integer> factors = primeFactors(l);
	    String result ="";
	    int sum = 0;
	    int count = 0;
	    for(Integer factor : factors){
	      sum = 0;
	      count = 0;
	      for(Integer i: l){
	        if(i%factor == 0){
	          count++;
	          sum = sum+i;
	        }
	      }
	      if(count>0){
	        result+=String.format("(%d %2d)", factor, sum);
	      }
	    }
	    return result;
	  }
	  
	  public static List<Integer> primeFactors(int[] numbers) {
	        Set<Integer> factors = new HashSet<Integer>();
	        List<Integer> sorted = new ArrayList<Integer>();
	        int n;
	        for(int j= 0;j<numbers.length;j++){
	          n = numbers[j];
	          for (int i = 2; i <= n / i; i++) {
	            while (n % i == 0) {
	                factors.add(i);
	                n /= i;
	            }
	          }
	          if (n > 1) {
	              factors.add(n);
	          }
	        }
	        for(Integer factor: factors){
	          sorted.add(factor);
	        }
	        Collections.sort(sorted);
	        return sorted;
	    }
	}
