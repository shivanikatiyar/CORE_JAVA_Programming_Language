import java.io.*;
class CheckSquare
{
public static void main(String[] args)throws IOException
{
InputStreamReader nv=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(nv);
System.out.println("Enter the length and breath ");
int l,b;
l=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
if(l==b)
{
System.out.println("It is a Square");}
else
System.out.println("It is a Rectangle");
}
}
