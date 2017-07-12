package org.alexgdev.codewars.sixkyu;

import java.util.function.*;

/*
 * https://www.codewars.com/kata/function-iteration/train/java
 */
public class GetIterator {
  public static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
	  GetIterator g = new GetIterator();
	  return g.new IterFunction(func, times);
	  

  }
  
  private class IterFunction implements Function<Integer, Integer>{
	
	private int times;
	private Function<Integer, Integer> func;
	
	public IterFunction(Function<Integer, Integer> func, int times){
		this.func=func;
		this.times=times;
	}

	public Integer apply(Integer t) {
		for(int i = 0;i<times; i++){
			t = func.apply(t);
		}
		
		return t;
	}
	  
  }
}