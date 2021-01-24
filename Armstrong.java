import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
int c=0,n1,r,num,s=0,p=1,c1;
n1=n;
while(n!=0)
{
n=n/10;
c++;
}
num=n1;
c1=c;
while(n1!=0)
{
p=1;
r=n1%10; 
while(c1>0)
{
	p=p*r;
	c1--;
}
c1=c;
s=s+p;
n1=n1/10;
}
if(s==num)
System.out.println(+num+" is armstrong number");
else
System.out.println(+num+" is not armstrong number");
}
}
