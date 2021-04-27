import java.util.Scanner;
public class Function_Calculate {
   Scanner sc=new Scanner(System.in);
   int a,b,c;
  private void sum()
  {   System.out.println("Enter two number :");
      a=sc.nextInt();
      b=sc.nextInt();
      c=a+b;
      System.out.println("Sum= "+c);
  }
  private int mul(int x,int y)
  {
      c=x*y;
      return c;
  }
  int sub(int a,int b)
  {
      c=a-b;
      return c;
  }
  public void div(int a,int b)
  {
      c=a/b;
      System.out.println("div= "+c);
  }
  public static void main(String [] args){
      Function_Calculate obj=new Function_Calculate();
      int r=obj.sub(34,4);
      System.out.println("sub= "+r);
      int f=obj.mul(5,4);  
      System.out.println("mul= "+f);
      obj.div(20,2);
      obj.sum();
  } 
}
