import java.util.*;
class DoubleDigitSum {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(sum(n));
 }
 static int sum(int n){
  int target = digitsum(n)*2;
  int num = n+1;
  while(num>0){
   if(digitsum(num) == target) return num;
  num++;
  } 
 return -1;
 }
 static int digitsum(int n){
  int sum = 0;
  while(n>0){
   sum+= n%10;
   n = n/10;
  }
  return sum;
 }
 
}