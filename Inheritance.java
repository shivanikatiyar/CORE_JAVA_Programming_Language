public class Inheritance {  // Inheritance example
    public static void main(String [] args)
    {
        b obj=new b();     // object create child class
        obj.sum(10,2);
        obj.sub(1,0);
        obj.mod(12,2);
        obj.mul(12,2);
        obj.div(12,2);
    }
}
class x                   // Grandparent class
{
    public x()            // constructor method
    {
        System.out.println(" X constructor called");
    }
    void mod(int a,int b){  // method
         System.out.println("mod = "+(a%b));
    }
}
class a extends x {         // parent class
      public a()            // constructor method
    {
        System.out.println(" a constructor called");
    }
    void sum(int a,int y){    // method
         System.out.println("sum = "+(a+y));
    }
    void sub(int a,int y){    // method
         System.out.println("sub = "+(a-y));
    }
}

class b extends a {           // child class
      public b()              // constructor method
    {
        System.out.println(" b constructor called");
    }
    void div(int a,int y){    // method
         System.out.println("div = "+(a/y));
    }
    void mul(int a,int y){    // method
         System.out.println("mul = "+(a*y));
    }
}
