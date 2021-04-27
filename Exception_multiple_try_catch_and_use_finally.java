import java.util.*;
public class Exception_multiple_try_catch_and_use_finally {
        public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        try
        {
            System.out.println("Enter n1");
            int a=sc.nextInt();
            System.out.println("Enter n2");
            int b=sc.nextInt();
            c=a/b;
        }
        catch(ArithmeticException obj)  // multiple catch
        {
            System.out.println(obj.getMessage());
        }
        catch(InputMismatchException obj)
        {
         System.out.println("Please taken input is not integer");
        }
        finally
        {
            System.out.println("c= "+c);
        }
    }
}


