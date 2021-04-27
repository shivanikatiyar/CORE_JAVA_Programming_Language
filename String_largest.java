import java.util.Scanner;
public class String_largest {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s[]=s1.split(" ");
        String shorte=s[0];
        String longe="";
        for(String s2:s)      // using for each loop
        {
            if(s2.length()<shorte.length())
            {
                shorte=s2;
            }
            if(s2.length()>longe.length())
            {
                longe=s2;
            }
        }
        System.out.println("Largest string : "+longe);
        System.out.println("Smallest string : "+shorte);
    }   
}
