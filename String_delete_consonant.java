import java.util.Scanner;
public class String_delete_consonant 
{
  public static void main(String [] args)
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        int l=s1.length();
        char c;
        for(int i=0;i<l;i++)
        {
          c=s1.charAt(i);
          if(c==97||c==101||c==105||c==111||c==117||c==32||c==',')
          {
            System.out.print(c);
          }
        }
        System.out.println();
    }
}
