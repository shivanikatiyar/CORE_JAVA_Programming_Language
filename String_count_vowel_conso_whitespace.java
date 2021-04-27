import java.util.*;
public class String_count_vowel_conso_whitespace{
     public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        char c;
        int count_v=0,count_n=0,count_con=0,count_w=0;
        for(int i=0;i<s1.length();i++)
        {
           c=s1.charAt(i);
           if(c==97||c==101||c==105||c==111||c==117)
           {
              count_v++; 
           }
           else if(c==32)
           {
              count_w++; 
           }
           else if(c>='0'&&c<='9')
           {
               count_n++;
           }
           else
           {
              count_con++;
           }
        }
       System.out.println("No of Vowel: "+count_v);
       System.out.println("No of Consonant: "+count_con);
       System.out.println("No of whitespace: "+count_w);
       System.out.println("No of Number: "+count_n);
    }   
}
