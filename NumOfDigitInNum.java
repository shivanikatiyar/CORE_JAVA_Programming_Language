import java.io.*;
class  NumOfDigitInNum_Sum_Prod
{
public static void main(String[] args)throws IOException
{
 InputStreamReader nl=new InputStreamReader(System.in);
 BufferedReader br= new BufferedReader(nl);
 System.out.println("Enter the number :");
 int n=Integer.parseInt(br.readLine());
 int c=0,r,s=0,p=1;
 while(n!=0)
 {
 r=n%10;
 c+=1;
 s=s+r;
 p=p*r;
 n=n/10;
 }
  System.out.println("Number of digit in a number : "+c);
  System.out.println("Sum of digit in a number : "+s);
  System.out.println("Product of digit in a number : "+p);
 }
 }
 
  