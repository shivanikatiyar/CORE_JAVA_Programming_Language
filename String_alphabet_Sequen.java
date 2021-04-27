import java.io.*;
public class String_alphabet_Sequen
{
    public static void main(String [] args)throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n;
       System.out.println("Enter number of strings you would like to enter:");
       String temp;
       n=Integer.parseInt(br.readLine());
       String s[]=new String[n];
       System.out.println("Enter the Strings :");
       int i,j;
       for(i=0;i<n;i++)
       {
        s[i]=br.readLine(); 
       }
       for(i=0;i<n;i++)
       {
           for(j=i+1;j<n;j++)
           {                                // compare to return unicode 
            if(s[i].compareTo(s[j])>0)     // asending ordered
                {  
                   temp=s[i];
                   s[i]=s[j];
                   s[j]=temp;
                }
           }
        }
       System.out.print("Strings in Sorted order:");
       for(i=0;i<=n-1;i++)
       {
           System.out.print(s[i]+", ");
       }
    }  
}
