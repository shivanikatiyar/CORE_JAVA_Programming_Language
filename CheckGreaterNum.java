import java.io.*;
class CheckGreaterNum
{
public static void main(String[] args)throws IOException
{
InputStreamReader nv=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(nv);
System.out.println("Enter the Two number : ");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
if(a>b)
{
System.out.println("Greater Number :"+a);}
else
System.out.println("Greater Number :"+b);
}
}