import java.util.*;
//WAP that reads a set of integers.and then prints the sum of the even and odd integer.7
public class Do_While_using_EvenOdd {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,e_sum=0,o_sum=0;
        char choice;
        do
        {
            System.out.println("Enter the number ");
            num=sc.nextInt();
            if(num%2==0)
            {
                e_sum+=num;
            }
            else
            {
                o_sum+=num;
            }
            System.out.print("Do you want to continue x/n : ");
            choice=sc.next().charAt(0);
        }while(choice=='x'||choice=='X');
        System.out.println("Sum of Even number: "+e_sum);
        System.out.println("Sum of Odd number: "+o_sum);
    }
}
