import java.util.*;
public class Do_while_userwant_toInput {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int f_num,s_num,sum=0;
    int choice;
    do
    {
        System.out.println("Enter the first number : ");
        f_num=sc.nextInt();
        System.out.println("Enter the second number : ");
        s_num=sc.nextInt();
        sum=f_num+s_num;
        System.out.println("Sum of two number is = "+sum);
        System.out.println("Do you want to continue 1/0 : ");
        choice=sc.nextInt();
    }while(choice==1);
    }    
}
