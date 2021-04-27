public class Abstract_Q_1{
   public static void main(String [] args){  
       subcl1 s2=new subcl1(); 
       s2.messag();
       subcl2 s1=new subcl2();
       s1.messag();
    }
}
abstract class Parent1
{
    protected void print1()
    {
        System.out.println("Parent class");
    }
    protected abstract void messag();
}
     class subcl1 extends Parent1
{
      public void messag()
    {
        System.out.println("This is first class");
    }
}
 class subcl2 extends Parent1
{
     public void messag()
    {
        System.out.println("This is second class");
    }
}