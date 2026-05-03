//remove one integer and get max value after removing
import java.util.*;
class maxNum{
 public static void main(String[] args)
{
   Scanner sc  = new Scanner(System.in);
   int n = sc.nextInt();
   String s = String.valueOf(n);
   int best = Integer.MIN_VALUE;
   for(int i=0;i<s.length();i++){
     if(i==0 && s.charAt(i)=='-') continue;
       String str = s.substring(0,i)+s.substring(i+1);
       if(str.equals("") || str.equals("-")) str="0";
       int m = Integer.parseInt(str);
       best = Math.max(m,best);
     
   }
   System.out.println(best);
 }
}

