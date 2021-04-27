import java.util.*;
public class Abstract_class_GFG_Q {
public static void main(String [] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of input :");
     int t=sc.nextInt();
     while(t-->0)
     {   System.out.println("Enter the One number");
         int a1=sc.nextInt();
         System.out.println("Enter the second number");
         int a2=sc.nextInt();
         B22 ob=new B22();
         ob.m1(a1,a2);
         ob.m2();
     }
 }
}
abstract class  A22      
 {
    int prod;  // instance variable
    abstract void m1(int p,int q);   // abstract method
    void m2(){
     System.out.println(prod);
    }
}
class B22 extends A22 
{
    void m1(int p,int q) {
       super.prod=p*q;
    }
}
