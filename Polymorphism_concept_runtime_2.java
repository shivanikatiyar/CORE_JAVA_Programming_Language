import java.io.*;
public class Polymorphism_concept_runtime_2 {
   public static void main(String args[])throws IOException
  {
      try{
          
          bank b=new icic();  // upcosting
          System.out.println(b.getintrestrate());
          bank b1=new sbi1();
          System.out.println(b1.getintrestrate());
         }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
  }
}
class bank1
{
    float ir=5.0f;
    float getintrestrate()
    {
        return ir;
    }
}
class icic extends bank
{
    float ir=6.0f;
    float getintrestrate(){
        return ir;
    }
}
class sbi1 extends bank
{
    float ir=4.9f;
    float getintrestrate(){
        return ir;
    }
}

