import java.util.*;
public class Using_conditional_threeNumLarge {
    public static void main(String [] args){ 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number :");
       int a=sc.nextInt();
       System.out.println("Enter the second number :");
       int b=sc.nextInt();
       System.out.println("Enter the thrid number :");
       int c=sc.nextInt();
       int m=(a>b&&a>c?a:(b>c?b:c));
       System.out.println("Maximum number : "+m);
            
    }
    
}
