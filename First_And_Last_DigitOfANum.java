import java.io.*;
class First_And_Last_DigitOfANum
{
public static void main(String[] args)throws IOException
{
 InputStreamReader nl=new InputStreamReader(System.in);
 BufferedReader br= new BufferedReader(nl);
 System.out.println("Enter the number :");
 int n=Integer.parseInt(br.readLine());
 int f=0,l=0,s,d;
 l=n%10;
 System.out.println("Last Digit :"+l);
 while(n!=0)
 {
 f=n%10;
 n=n/10;
 }
 System.out.println("First Digit: "+f);
 s=l+f;
 System.out.println("Sum of first and last digit :"+s);
 d=f+l;
 l=d-l;
 f=d-f;
 System.out.println("After Swapping first digit = "+f+ " ,last digit = "+l);
 }
 }
 