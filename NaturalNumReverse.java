import java.io.*;
class NaturalNumReverse
{
public static void main(String[] args)throws IOException
{
 InputStreamReader nl=new InputStreamReader(System.in);
 BufferedReader br= new BufferedReader(nl);
 System.out.println("Enter the number :");
 int n=Integer.parseInt(br.readLine());
 System.out.println("Print natural number from "+n+ " to 1");
 int i=n;
 while(i>0)
 {
  System.out.println(i);
  i--;
 }
 }
 }