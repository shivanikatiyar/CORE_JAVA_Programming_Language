import java.util.Scanner;
public class Without_Method_use_printFirstLastocceChar {
    // wap to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String s=sc.nextLine();
       int f=0,last=0;
       System.out.println("Enter the given string character");
       char c=sc.next().charAt(0);
       int l=s.length();
       int count=0;
       for(int i=0;i<l;i++)
       {
           if(c==s.charAt(i))
           {
               if(count==0)
               {
               f=i;
               }
               last=i;
              
               count++;
           }
       }
       
       System.out.println("first index = "+f);
       System.out.println("last index = "+last);
    }
}
