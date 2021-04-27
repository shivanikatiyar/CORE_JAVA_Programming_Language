import java.util.*;
public class Rcetangle_square_Inheritance {
    public static void main(String [] args)
    {
        Rectangl obj=new Rectangl(5,3); // parent class obj create and constructor value pass
        obj.area();
        obj.perimeter();
        Square obj1=new Square(3);
        obj.area();
        obj.perimeter();
        Square a[]=new Square[10];
        int k=5;
        for(int i=0;i<10;i++)
        {
            a[i]=new Square(k);
            k++;
        }
        for(int i=0;i<10;i++)
        {
           a[i].area();
           a[i].perimeter();
            
        }
    }
}
class Rectangl  // parent class
{
    int len,b;
    public Rectangl(int len,int b) // constructor
    {
        this.len=len;
        this.b=b;
    }
    public void area()    // Method
    {
        System.out.println("Area of Rectangle = "+(len*b));
    }
    public void perimeter() // Method
    {
        System.out.println("perimeter of Rectangle = "+2*(len+b));
    }
}
class Square extends Rectangl  // child class
{
     public Square(int s)  // constructor
     {
         super(s,s); // call constructor parent class(pass value)
         System.out.println("Area of square = "+(s*s));
     }
}
