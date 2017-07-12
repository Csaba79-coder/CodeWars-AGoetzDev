package org.alexgdev.codewars.fourkyu;

import java.util.Stack;

/*
 * https://www.codewars.com/kata/reverse-polish-notation-calculator/train/java
 */
public class ReversePolishCalc {
	public double evaluate(String expr) {
	    if(expr == null || expr.equals("")){
	    return 0;
	    }
	    Stack<Double> stack = new Stack<Double>();
	    for(String s: expr.split(" ")){
	      switch(s){
	            case "+":
	                stack.push(stack.pop()+stack.pop());
	                break;
	            case "-":
	                Double first = stack.pop();
	                stack.push(stack.pop() - first);
	                break;
	            case "*":
	                stack.push(stack.pop()*stack.pop());
	                break;
	            case "/":
	                first = stack.pop();
	                stack.push(stack.pop() / first);
	                break;
	            default:
	                stack.push(Double.parseDouble(s));
	                break;
	      }
	    }
	    Double result = stack.pop();
	    
	    return result;
	  }

}
