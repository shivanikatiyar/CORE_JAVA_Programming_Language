import java.util.*;
public class Exception_try_catch_finally {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        try
        {
            int a=7;   
            System.out.println("Enter number ");
            int b=sc.nextInt();
            c=a/b;
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj.getMessage());
        }
      /*  finally
        {
            System.out.println("c= "+c);
        }*/
    }
}
