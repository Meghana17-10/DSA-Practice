import java.util.*;
class FillingGlasses {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
 int k = sc.nextInt();
 System.out.println(count(n,k));
 }
 static int count(int n, int k){
   if(n>k){       //if glasses are more than water, then they can fit in a single glass value of 'n' --> water liters=5, glasses=4 therefore water can fit in 5l glass
     return 1;
   }
   int count=0;
   int sum = (n*(n+1))/2;  //total sum(n)=(n(n+1))/2
   if(sum< k) return -1;   //if water quantity is more than total glasses sum then return -1;
   for(int i=n;i>0;i--){
    if(k>=i){        //if water is greater than or equal to glass, then it can fit in it.
      k = k-i;        //new value of water will be changed (k-glass filled)
      count++;
    }               //if in loop k<i then skip that value as we need min num of glasses to be filled
    if(k==0) return count; 
   }
   return -1;
  }
}