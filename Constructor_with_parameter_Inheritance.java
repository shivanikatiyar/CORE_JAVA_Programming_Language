public class Constructor_with_parameter_Inheritance {
 public static void main(String [] args)
 {
    cjk obj=new cjk("dfgh","rytu");
 }
}
class Const
{
    public Const(String str)    
    {
       System.out.println("Constructor of a"+str);
    }
    public Const()  
    {
        System.out.println("Constructor of Const");
    }
}
class cjk extends Const
{
    public cjk(String bstr,String name)  
    {
       super(bstr);  // super() method use call the parent class const. call karne ke liye
       System.out.println("Class is cjk "+name);
    }
}  

