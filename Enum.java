public class Enum {
    enum days{MON,TUE,WED,THU,FRI,SAT,SUN}
    void display() 
    {
        System.out.println(days.FRI);
        for(days d:days.values())
        {
            System.out.println(d);
        }
        System.out.println(days.valueOf("MO"));
    }

public static void main(String args[])
{
  Enum e=new Enum();
  e.display();
}
}