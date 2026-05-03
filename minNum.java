//remove one digit to get minimum number from the whole digit
import java.util.*;
class minNum{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String s = String.valueOf(n);
  int min = Integer.MAX_VALUE;
  for(int i=0;i<s.length();i++){
   String str = s.substring(0,i)+s.substring(i+1);
   int m = Integer.parseInt(str);
   min = Math.min(min,m);
  }
  System.out.println(min);
 }
}