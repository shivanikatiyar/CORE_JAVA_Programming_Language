import java.io.*;
class CheckGreatestAge
{
public static void main(String[] args)throws IOException
{
InputStreamReader nv=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(nv);
System.out.println("Enter the Age of three People : ");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
if(a>b&&a>c)
{
System.out.println("Age of Older People :"+a);
if(b>c)
{
System.out.println("Age of Younger People :"+c);}	
else
System.out.println("Age of Younger People :"+b);
}
else if(b>a&&b>c)
{
System.out.println("Age of Older People :"+b);
if(a>c)
{
System.out.println("Age of Younger People :"+c);}	
else
System.out.println("Age of Younger People :"+a);
}
else if(c>a&&c>b)
{
System.out.println("Age of Older People :"+c);
if(a>b)
{
System.out.println("Age of Younger People :"+b);}	
else
System.out.println("Age of Younger People :"+a); 
}
else
	System.out.println("Age of three people are equal");
}
}