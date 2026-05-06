//class, objects, constructor and polymorphism(method overloading)

class pen {
  String color;
  String type;
  int count;
  public void write() {
   System.out.println("Write something");
  }
  public void write(String type) {
   System.out.println(type);
  }
  public void write(String color, int count){
   System.out.println(color+" "+count);
  }
  pen() {
   System.out.println("Constructor");
  }

}
public class Oops {
  public static void main(String[] args){
   pen p = new pen(); //new is a keyword (allocates the whole object in the memory heap, Student() this is a constructor) 
   p.color = "blue";
   p.write(p.color, p.count);
   p.write(p.type);
  }
 }