public class Abstract_Q_4 {
    public static void main(String [] args)
    {
        SubClass ob=new SubClass();
        ob.a_name(); // subclass method
        ob.non_abts();
    }   
}
abstract class a_name
{
    protected a_name() // constructor
    {
        System.out.println("This is constructor of abstract class");
    }
    public void non_abts()
    {
        System.out.println("This is a normal method of abstract class");
    }
}
 class SubClass extends a_name
{
    public void a_name()
    {   
        System.out.println("This is abstract method ");
    }
}
