package org.alexgdev.codewars.sixkyu;
/*
 * https://www.codewars.com/kata/consecutive-strings/train/java
 */
public class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length == 0 || k > strarr.length || k <= 0){
          return "";
        }
        String consec="";
        boolean stop = false;
        int maxlength = 0;
        String maxConsec = "";
        for(int i=0;i<strarr.length;i++){
          consec = "";
          for(int j = 0;j < k;j++){
            if(i+j >=strarr.length){
              stop = true;
              break;
            }
            consec +=strarr[i+j];
          }
          if(stop){
            break;
          } else if(consec.length() > maxlength){
            maxlength = consec.length();
            maxConsec = consec;
          }
          
        }
        return maxConsec;
    }
}