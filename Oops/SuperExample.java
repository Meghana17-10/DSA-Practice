class A{
 A() {
 super(); //bydefault
 System.out.println("A");
 }
 A(int n) {
 super();  //bydefault
 System.out.println("int A");
 }
}
class B extends A {
 B() {
  super(); //bydefault
  System.out.println("B");
 }
 B(int b) { 
  //super();  //bydefault
  super (b);
  System.out.println("int B");
 }
}
public class SuperExample {
 public static void main(String[] args){
  B obj = new B(); //op will be A B because first prints parent class then child class.
  B obj1 = new B(5); //op will be A int B, because there will be super() method automatically in every constructor. it is default so it calls default constructor
 }
}