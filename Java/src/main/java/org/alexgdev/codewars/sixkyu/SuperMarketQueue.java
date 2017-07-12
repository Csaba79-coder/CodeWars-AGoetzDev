package org.alexgdev.codewars.sixkyu;

/*
 * https://www.codewars.com/kata/the-supermarket-queue/train/java
 */
public class SuperMarketQueue {
	public static int solveSuperMarketQueue(int[] customers, int n) {
	      int[] slots = new int[n];
	      int time = 0;
	      int currentCustomer = 0;
	      int sumslots = 0;
	      while(!(sumslots==0 && currentCustomer == customers.length)){
	        sumslots = 0;
	        for(int i = 0; i<slots.length;i++){
	          if(slots[i] == 0 && currentCustomer != customers.length){
	            slots[i] = customers[currentCustomer];
	            currentCustomer++;
	          }
	          if(slots[i] > 0){
	             slots[i] = slots[i]-1;
	          }
	          sumslots += slots[i];
	        }
	        time++;
	      }
	      return time;
	    }

}
