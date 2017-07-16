package org.alexgdev.codewars.sixkyu;

public class RevRot {
    
    public static String revRot(String strng, int sz) {
        if(sz <= 0 || strng.length() == 0 || sz > strng.length()){
          return "";
        }
        String result ="";
        for(int i = 0; i+sz<=strng.length();i=i+sz){
        	String subset = strng.substring(i,i+sz);
        	if(subset.matches("\\d+")){
        		
        		int sum = 0;
        		for(char c: subset.toCharArray()){
        			int val = c -'0';
        			sum += (val*val*val);
        		}
        		if(sum%2 == 0){
        			StringBuilder sb = new StringBuilder(subset);
        			result+=sb.reverse().toString();
        		} else {
        			result += rotate(subset);
        		}
        	} else{
        		result += rotate(subset);
        	}
        }
        return result;
    }
    
    private static String rotate(String s){
    	String rotate = s+s;
    	return rotate.substring(1, s.length()+1);
    }
    
    
    
}
