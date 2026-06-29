import java.util.*;
class TwoSum {
 public static void main(String[] args){
  Scanner sc  = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }
  int target = sc.nextInt();
  int[] res = two(arr,target);
  System.out.println(res[0]+res[1]);
 }
 static int[] two(int []num,int target){
  for(int i=0;i<num.length;i++){
   for(int j=i+1;j<num.length;j++){
     if(num[i]+num[j] == target) return new int[]{i,j};
   }
  }
  return new int[]{-1,-1};
 }
}