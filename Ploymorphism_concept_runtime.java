import java.io.*;
public class Ploymorphism_concept_runtime {
  public static void main(String args[])throws IOException
  {
      try{
         // Class obj=Class.forName(args[0]);// this run command line argument.
          Class obj=Class.forName("sbi"); // class and forName predefind class and method.
          bank b=(bank)obj.newInstance();
          System.out.println(b.getintrestrate());
         }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
  }
}
class bank
{
    float ir=5.0f;
    float getintrestrate()
    {
        return ir;
    }
}
class icici extends bank
{
    float ir=6.0f;
    float getintrestrate(){
        return ir;
    }
}
class sbi extends bank
{
    float ir=4.9f;
    float getintrestrate(){
        return ir;
    }
}
