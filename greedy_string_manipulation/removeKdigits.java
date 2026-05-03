import java.util.*;
class removeKdigits{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  String s = String.valueOf(n);
  int best = Integer.MIN_VALUE;
  for(int i=0;i<=k;i++){
   for(int j=i+k-1;j<s.length();j++){
    if(i==0 && s.charAt(i)=='-') continue;
    String str = s.substring(0,i)+s.substring(j+1);
    if(str.equals("")||str.equals("-")) str="0";
    int val = Integer.parseInt(str);
    best = Math.max(best,val);
   }
  }
  System.out.println(best);
 }
}