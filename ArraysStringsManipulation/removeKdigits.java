//4. Remove K digits to maximize number Given N and integer K, remove K digits to get the largest possible number. 
// Example: N = 1432219, K = 3 → 4329

//for continuous deletion 
/*import java.util.*;
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
}*/

//for scattered/arbitrary deletion
import java.util.*;
class removeKdigits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int k = sc.nextInt();
    Stack<Character> s  = new Stack<>();

    for(int i=0;i<str.length();i++){
     char c = str.charAt(i);
     
      while(!s.isEmpty() && k>0){
       if(s.peek() < c){
        s.pop();
        k--;
      }else break;
     }

     s.push(c);
    }
    while(k>0 && !s.isEmpty()){
     s.pop();
     k--;
    }

    StringBuilder sb = new StringBuilder();
    for(char c: s) sb.append(c);
    System.out.println(sb.toString());
    
  }
}