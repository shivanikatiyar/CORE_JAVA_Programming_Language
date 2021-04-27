import java.util.*;
public class String_smalnum_function {
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     public void smallNum()
  {   System.out.println("Enter three number :");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      float small=(a<b&&a<c?a:(b<c?b:c));
      System.out.println("Small number = "+small);
  }
    public float ave(int x,int y,int z)
  {
      float a=(float)(x+y+z)/3;
      return a;
  }
      public void sumofDigit()
  {   System.out.println("Enter a number :");
      int n=sc.nextInt();
      int s=0,r;
      while(n>0)
      {
          r=n%10;
          s=s+r;
          n=n/10;
      }
      System.out.println("Sum of Digit = "+s);
  }
    public static void main(String [] args)
    {
     String_smalnum_function obj=new String_smalnum_function();
     obj.smallNum();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter three number :");
     int p=sc.nextInt();
     int y=sc.nextInt();
     int t=sc.nextInt();
     float l=obj.ave(p,y,t);
     System.out.println("Average = "+l);
     obj.sumofDigit();
    }
}
