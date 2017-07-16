package org.alexgdev.codewars.fourkyu;

import java.util.Stack;

public class BraceChecker {

	  public boolean isValid(String braces) {
	    if(braces.equals("")){
	    	return true;
	    }
	    Stack<Character> innermost = new Stack<Character>();
	    for(char c: braces.toCharArray()){
	    	if (c == ')'){
	    		if(innermost.isEmpty() ||innermost.peek() != '('){
	    			return false;
	    		} else {
	    			innermost.pop();
	    		}
	    	} else if (c == ']'){
	    		if(innermost.isEmpty() ||innermost.peek() != '['){
	    			return false;
	    		} else {
	    			innermost.pop();
	    		}
	    	} else if (c == '}'){
	    		if(innermost.isEmpty() ||innermost.peek() != '{'){
	    			return false;
	    		} else {
	    			innermost.pop();
	    		}
	    	} else {
	    		innermost.push(c);
	    	}
	    }

	    return innermost.isEmpty();
	  }
	  

	}
