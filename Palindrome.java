import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number : ");
int rev=0,r,num;
int n=sc.nextInt();
num=n;
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(num==rev)
{
System.out.println("Number is Palindrome");}
else
System.out.println("Number is not Palindrome");
}
}