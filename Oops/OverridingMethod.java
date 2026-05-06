//Method Overriding 
class Calc{
 void add(int n, int m){
  System.out.println(n+m);
 }
}
class Advcal extends Calc {
@Override
 void add(int n, int m){
  
  System.out.println(n+m+1);
 }
}
public class OverridingMethod {
 public static void main(String[] args){
  Advcal a = new Advcal();
  a.add(3,4);
 }
}