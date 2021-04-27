import java.util.Scanner;
public class String_Palindrom {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2="";
        System.out.println("Enter a string :");
        s1=sc.nextLine();
        int n=s1.length();
        int i;
        for(i=n-1;i>=0;i--)
        {
          s2=s2+s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(s2))
        {
          System.out.println("The string is palindrome");
        }
        else
        {
          System.out.println("The string is not palindrome");
        }
    } 
}
