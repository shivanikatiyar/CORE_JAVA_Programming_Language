public class Super_keyward_by_parent_method_call {
  public static void main(String [] args)
  {
      Ba ob=new Ba();
      ob.show();
  }
}
  class Aa
  {
      void m1() //overriding method
      {
          System.out.println("I m a class A");
      }
  }
  class Ba extends Aa
  {
      void m1()
      {
          System.out.println("I m class Ba");
      }
      void show()
      {
          m1(); // call method m1 in class Ba
          super.m1(); // call method in parent class
      }
  }
 

