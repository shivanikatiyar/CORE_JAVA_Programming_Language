public class Overriding_Inheritance {
 public static void main(String [] args)
 {
     c obj=new c();
     obj.hello();
 }
}
class h
{
    public void hello()    // overriding method--> name and parameter same but class different.
    {
        System.out.println("Class is A");
    }
}
class c extends h
{
    public void hello()  // overriding method
    {
      //  super.hello();     // using super keyward through parent class method call.
        System.out.println("Class is B");
    }
}