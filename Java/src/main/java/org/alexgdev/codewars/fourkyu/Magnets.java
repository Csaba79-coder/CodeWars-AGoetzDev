package org.alexgdev.codewars.fourkyu;

import java.math.BigDecimal;

public class Magnets {
	 
	    public static double doubles(int maxk, int maxn) {
	        double sum = 0;
	        for(int i = 1; i<=maxk;i++){
	        	sum+= sumK(i, maxn);
	        }
	        return sum;
	    }
	    
	    public static double sumK(int k, int n){
	    	double sum = 0;
	    	for(int i = 1; i<=n;i++){
	    		
	    		sum += 1.0 / (k*Math.pow((double)i+1, 2.0*k));
	    	}
	    	return sum;
	    }
	    
	    

}
