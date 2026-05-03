//remove one 3 digit from whole number to get maximum number

import java.util.*;
class remThree{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String s = String.valueOf(n);
  int best = Integer.MIN_VALUE;
  for(int i=0;i<s.length();i++){
   if(s.charAt(i)=='3'){
     String str = s.substring(0,i)+s.substring(i+1);
     if(str.equals("")||str.equals("-")) str="0";
     int val = Integer.parseInt(str);
     best = Math.max(best,val);
    }
   }
   System.out.println(best);
  }
}