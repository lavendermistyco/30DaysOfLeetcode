package Leet;
/* A happy number is a number defined by the following process: 
   Starting with any positive integer, replace the number by the 
   sum of the squares of its digits, and repeat the process until 
   the number equals 1 (where it will stay), or it loops endlessly in a 
   cylce which does not incluse 1. Those numbers for which this process
   ends in 1 are happy numbers. 

   Return True if n is a happy number, and False if not. 

   Example:
      Input: 19 
      Output: true
      Explanation: 
      1^2 + 9^2 = 82
      8^2 + 2^2 = 68
      6^2 + 8^2 = 100 
      1^2 + 0^2 + 0^2 = 1

*/

import java.util.ArrayList;

public class HappyNumbers {

  public boolean isHappy(int n){
    int sumOfSquares = 0; 
    if(n == 1){   //Test Case if n is one 
      return true;
    }
    ArrayList<Integer> cache = new ArrayList<>(); //store the sumOfSquares

    while (sumOfSquares != 1){
      sumOfSquares = 0;
      ArrayList<Integer> storage = new ArrayList<>(); 
      //first we need to extract the digits of the number by using mod operator
      while(n > 0){
        storage.add(n % 10);
        n /= 10; 
      }
      //now we need to access those integers and square the digits
      for(int i : storage){
        sumOfSquares += i * i;
      }
      if(cache.contains(sumOfSquares)){
        return false;
      }
      cache.add(sumOfSquares);
      n = sumOfSquares;
  
  }
      return true;

  }



  
}