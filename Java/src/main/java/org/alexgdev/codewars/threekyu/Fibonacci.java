package org.alexgdev.codewars.threekyu;

import java.math.BigInteger;
/*
 * https://www.codewars.com/kata/the-millionth-fibonacci-kata/train/java
 */
public class Fibonacci {
	
	public static BigInteger fib(BigInteger n) {
	    if(n.compareTo(BigInteger.ZERO) < 0){
	    	return negativeFib(n);
	    } else if(n.compareTo(BigInteger.ZERO) > 0){
	    	return positiveFib(n);
	    } else {
	    	return BigInteger.ZERO;
	    }
	 }
	
	public static BigInteger negativeFib(BigInteger n){
		n = n.negate(); // make positive;
		BigInteger fib_n = positiveFib(n);
		if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0){
			return fib_n.negate();
		} else{
			return fib_n;
		}
		
	}
	
	//F2n = Fn *(2Fn_1-Fn)
	//F2n_1=Fn_1^2 + Fn^2
	
	public static BigInteger positiveFib(BigInteger n){
		
		
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		BigInteger c = BigInteger.ZERO;
		BigInteger d = BigInteger.ONE;
		BigInteger temp1;
		BigInteger temp2;
		if(n.compareTo(BigInteger.ONE) == 0){
			return a;
		}
		n = n.subtract(BigInteger.ONE);
		BigInteger mult = BigInteger.valueOf(2);
		
		while(!n.equals(BigInteger.ZERO)){
			if(!n.mod(mult).equals(BigInteger.ZERO)){
				temp1 = d.multiply(b).add(c.multiply(a));
			    temp2 = d.multiply(b.add(a)).add(c.multiply(b));
			    a = temp1;
			    b = temp2;
				
			}
			temp1 = c.pow(2).add(d.pow(2));
			temp2 = d.multiply(c.multiply(mult).add(d));
			
			c= temp1;
			d= temp2;
			
			n = n.shiftRight(1);
		}
		return a.add(b);
		
		
		
		
		
		/* Iterative, slow
		 * for(BigInteger i = BigInteger.valueOf(1); i.compareTo(n)<0;i=i.add(BigInteger.ONE)){
			fib_n = fib_n2.add(fib_n1);
			fib_n2 = fib_n1;
			fib_n1 = fib_n;
		 }	
		}*/

	}
	
	

}
