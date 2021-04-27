import java.util.Scanner;
public class String_Function_countLine_and_word {
    Scanner sc=new Scanner(System.in);
    public int countWord(String s3)
    {
     String s1[]=s3.split(" ");
     int w=0;
     for(String s2:s1)
     {
      w++;
     }
     return w; 
    }
    private int countVowel(String s3)
    {
       char c;
       int count_v=0;
       for(int i=0;i<s3.length();i++)
       {
          c=s3.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
          {
            count_v++; 
          }
        }
        return count_v;    
    }
public void printMiddleNumChar()
   {
    System.out.println("Enter the String :");
    String s=sc.nextLine(); 
    int l=s.length();
    int e=0;
    if(l%2==0)
    {  
     e=l/2;
    for(int i=e-1;i<=e;i++) // string start index 0 to n-1
    { 
      System.out.print(s.charAt(i));
    }
    System.out.println();
    }
    else
    {
      e=(l)/2; // string start index 0 to n-1
      System.out.println(s.charAt(e));
    } 
    }
    public static void main(String [] args)
    {
     String_Function_countLine_and_word obj=new String_Function_countLine_and_word();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String :");
     String s=sc.nextLine();
     int b=obj.countWord(s);
     int a=obj.countVowel(s);
     System.out.println("No of word = "+b);
     System.out.println("No of vowel = "+a);
     obj.printMiddleNumChar();
    }
}
