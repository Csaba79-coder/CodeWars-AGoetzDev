package org.alexgdev.codewars.fivekyu;

import java.math.BigInteger;

/*
 * https://www.codewars.com/kata/perimeter-of-squares-in-a-rectangle/train/java
 */
public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		// your code
		n = n.add(BigInteger.ONE);
		BigInteger result = BigInteger.valueOf(1);
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c;
		
		for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n)<=0;i=i.add(BigInteger.ONE)){
			c = b;
			b = a.add(b);
			a = c;
			result = result.add(b);
		}
		return result.multiply(BigInteger.valueOf(4));
		
	}
}
