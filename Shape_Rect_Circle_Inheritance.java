public class Shape_Rect_Circle_Inheritance {
    public static void main(String [] args)
    {
        Squar obj1=new Squar();
        obj1.squt();
        obj1.rect();
        obj1.shape();
    }
}
class Shape
{
     public void shape(){
    System.out.println("This is Shape");}
}
class Rectangle extends Shape
{
     public void rect(){
    System.out.println("This is Rectangular shape");}
}
class Squar extends Rectangle
{
     public void squt(){
    System.out.println("Square is a Rectangle");}
}
class Circle extends Shape
{
     public void cir(){
    System.out.println("This is Circular shape");
     }
}