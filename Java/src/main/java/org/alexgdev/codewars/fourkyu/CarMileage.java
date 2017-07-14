package org.alexgdev.codewars.fourkyu;

public class CarMileage {

	  public static int isInteresting(int number, int[] awesomePhrases) {
		  if(number == 98 || number == 99){
			  return 1;
		  }
		  if(number<100){
			  return 0;
		  }
		  String test =""+number;
		  int result = 2;
		  for(int i = 0;i<3;i++){
			  if(checkZeros(test) || checkRepeat(test) || checkIncrementing(test) || checkDecrementing(test) || checkPalindrome(test)){
				  return result;
			  }
			  if(checkAwesomePhrases(number, awesomePhrases)){
				  return result;
			  }
			  number = number+1;
			  test= ""+number;
			  if(i==0){
				  result--;
			  }
		  }
		  return 0;
	  }
	  
	  public static boolean checkZeros(String number){
		  return number.matches("[0-9]0+");
	  }
	  
	  public static boolean checkRepeat(String number){
		  char a = number.charAt(0);
		  for(char c: number.toCharArray()){
			  if(c != a){
				  return false;
			  }
		  }
		  return true;
	  }
	  
	  public static boolean checkIncrementing(String number){
		  char prev = (char) (number.charAt(0)-1);
		  for(char c: number.toCharArray()){
			  System.out.println(c);
			  if(c == '0' && prev != '9'){
				  return false;
			  } else if(c!= '0' && c != prev+1){
				  return false;
			  }
			  prev = c;
		  }
		  return true;
	  }
	  
	  public static boolean checkDecrementing(String number){
		  char prev = (char) (number.charAt(0)+1);
		  for(char c: number.toCharArray()){
			  if(c != prev-1){
				  return false;
			  }
			  prev = c;
		  }
		  return true;
	  }
	  
	  public static boolean checkPalindrome(String number){
		  for(int i = 0; i<number.length()/2;i++){
			  if(number.charAt(i) != number.charAt(number.length()-1-i)){
				  return false;
			  }
		  }
		  return true;
	  }
	  
	  public static boolean checkAwesomePhrases(int number, int[] phrases){
		  for(int i = 0; i<phrases.length;i++){
			  if(phrases[i] == number){
				  return true;
			  }
		  }
		  return false;
	  }
	  
	}