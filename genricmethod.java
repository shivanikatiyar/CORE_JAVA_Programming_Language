
public class genricmethod
{ 
    public static <T extends Number>void sum( T a,T b) // extends Number class
    {
        System.out.println(a.intValue()*b.intValue());
    }
       public static void main(String args[])
    {
       genricmethod g=new genricmethod();
       g.sum(10.5,3.3);
        
}
}