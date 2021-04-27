public class Abstract_Q_5 {
   public static void main(String [] args)
   {
       Cats c=new Cats();
       c.cat();
       Dogs d=new Dogs();
       d.dogs();
   }
}
abstract class Animals
{
    protected abstract void cat();
    protected abstract void dogs();
}
abstract class Cats extends Animals
{
    public void cat()
    {
        System.out.println("cats meow");
    }
}
abstract class Dogs extends Animals
{
    public void dogs()
    {
        System.out.println("dogs bark");
    }
}