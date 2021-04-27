import java.util.*;
public class Random_Num {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random(); //Random class
        int gess=r.nextInt(500);
       // System.out.println(gess);
        int n;
        while(true){
        System.out.println("Enter the number :");
        n=sc.nextInt();
        if(n>gess)
        {
           System.out.println("Number is greater then gess number");
           System.out.println("Try again");
        }
        else if(n<gess)
        {
           System.out.println("Number is smaller then gess number");
           System.out.println("Try again");
        }
        else
        {
            System.out.println("This number is correct");
            break;
        }
}
  }
}
