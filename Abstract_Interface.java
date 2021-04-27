public class Abstract_Interface {
  public static void main(String [] args)
  {
    child c=new child();
    c.calc();
    c.display();
    Father f=new child(); // creating refrence of interface
    f.calc();
    f.display();
  }
}
interface Mother1
{
    float height=5.8f;
    void calc();
    void display();
}
interface Father
{
    float height=6.2f;
    void calc();
    void display();
}
class child implements Mother1,Father  // multiple interface
{
    float ch;
    public void calc()
    {
        ch=(Mother1.height+Father.height)/2;
    }
    public void display(){
        System.out.println("Mother height:"+Mother1.height);
        System.out.println("Father height:"+Father.height);
        System.out.println("child height:"+ch);
    }
}