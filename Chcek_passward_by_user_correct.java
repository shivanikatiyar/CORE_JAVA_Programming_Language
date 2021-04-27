import java.util.*;
public class Chcek_passward_by_user_correct {
  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);
     int pass=4562;
     while(true)
     {
         System.out.println("Enter the guess passward :");
         int num=sc.nextInt();
         if(num==pass)
         {
             System.out.println("This is correct passward");
             break;
         }
         else
         {
           System.out.println("This is not correct passward");
           System.out.println("Try again");
         }
     }
  }
}
