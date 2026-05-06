/*class Animal {
 void eat() {
  System.out.println("eating");
 }
}
class dog extends Animal {
  void bark() {
  System.out.println("barking");
 }
}*/
class shape {
 void area() {
   System.out.println("display area");
 }
}
class triangle extends shape {
 void area(int l, int h) {
  System.out.println(l*h*1/2);
 }
}
public class Inheritance{
 public static void main(String[] args){
  triangle t1 = new triangle();
  t1.area(3,5);
 }
}