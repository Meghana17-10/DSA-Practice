// Remove one digit to make number divisible by 3

//Given N, remove one digit so that the result is divisible by 3.
// If multiple answers exist → return largest.


import java.util.*;
class removeDivisible{
 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();

  int best = 0;

  String s = String.valueOf(n); //number to string conversion

  for(int i=0;i<s.length();i++){

   if(i==0 && s.charAt(i)=='-') continue;

   String str = s.substring(0,i)+s.substring(i+1);

   int val = Integer.parseInt(str);  //string to number conversion

   if(val%3 == 0) best = Math.max(best,val);  //checking if divisible by 3 and also checking that is it greater than previous one.

  }
  System.out.println(best);
 }
}
   
   