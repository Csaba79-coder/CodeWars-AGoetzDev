package org.alexgdev.codewars.fivekyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightSort {
	public static String orderWeight(String strng) {
		if(strng == null ||strng.length() == 0){
			return strng;
		}
		List<String> unsorted = Arrays.asList(strng.split(" "));
		Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int sum1 = sumChars(s1);
                int sum2= sumChars(s2);
                if(sum1==sum2){
                	return s1.compareTo(s2);
                } else {
                	return sum1-sum2;
                }      
            }
		}); 
		
		
		return String.join(" ", unsorted);
	}
	
	public static int sumChars(String s){
		int sum = 0;
		for(char c: s.toCharArray()){
			sum+=(c-'0');
		}
		return sum;
	}

	
	
	
}
