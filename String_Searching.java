import java.util.*;
public class String_Searching {
     public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        System.out.println("Enter the search string word:");
        String s2=sc.nextLine();
        String s[]=s1.split(" ");
        boolean string=false;
        for(String s3:s)      // using for each loop
        { string=false;
            if(s2.equalsIgnoreCase(s3))
            {
               string=true;
               break;
            }
        }
        if(string)
            System.out.println(s2+" word present in string.");
        else
            System.out.println(s2+" word is not present in string.");
    }
}
