public class Abstract_Q_3 {
   public static void main(String [] args)
   {
       A ob=new A(23,45,67);
       float s=ob.getPercentage();
       System.out.println("Student A percentage = "+s+"%");
       B ob1=new B(23,45,67,72);
       float s1=ob1.getPercentage();
       System.out.println("Student B percentage = "+s1+"%");
   }
}
abstract class Marks
{
    protected abstract float getPercentage();
}
 class A extends Marks
{
    int a,b,c;
    public A(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
   public float getPercentage()
   {
       return (a+b+c)/3;
   }
 }

 class B extends Marks
{
    int a,b,c,d;
    public B(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
   public float getPercentage()
   {
       return (a+b+c+d)/4;
   }
 }