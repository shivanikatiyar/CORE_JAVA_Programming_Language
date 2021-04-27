public class Abstract_Example {
    public static void main(String [] args)
    {
        Kery m=new Kery();
        Orange o=new Orange();
        m.category();
        m.name();
        m.test();
        o.category();
        o.name();
        o.test();
    }
}
abstract class fruits
{
    protected void category()
    {
        System.out.println("i am a fruit");
    }
    protected abstract void test();
    protected abstract void name();
}
 abstract class Mango extends fruits
{
    public void name()
    {
        System.out.println("My name is Mango");
    }
    public void test()
    {
        System.out.println("I am sweet in test");
    }
}
class Kery extends Mango
{
    public void name()
    {
        super.name(); // call overriding method using super keyward in Mango class
        super.test();
        System.out.println("My name is Kery");
    }
    public void test()
    {
        System.out.println("I am shour in test");
    }
}
class Orange extends fruits
{
    public void name()
    {
        System.out.println("My name is Orange");
    }
    public void test()
    {
        System.out.println("I am sweet & shour in test");
    }
}