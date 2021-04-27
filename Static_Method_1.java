// A static method can call only other static methods and cannot call a non-static method.
public class Static_Method_1 {
   static void display()
   {   show(); // call static method
       //nm();  // without static method not call in static method --> generate error
       System.out.println("1");
   }
   static int i=7;  // A static method can access only static data.It cannot access non-static data i.e. instance data
   static void show()
   {
       System.out.println(i);
   }
  /* void nm()
   {
       System.out.println("3");
   }*/
   public static void main(String [] args)
   {
       Static_Method_1.display();  // call static method with a class name (without create object)
   }
}
// 2 1