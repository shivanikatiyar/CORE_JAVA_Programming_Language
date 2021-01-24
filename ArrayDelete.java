import java.util.Scanner;
class ArrayDelete
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
System.out.println("Enter the " +n+" of array:");
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("which position Delete the element:");
int x=sc.nextInt();
for(i=0;i<=x;i++)
{
if((i+1)==x)
{
	a[i]=0;
}
}
System.out.println("After Delection array:");
for(i=0;i<n;i++)
{
	if(a[i]==0&&(i+1)==x)
	{
	continue;}
System.out.print(a[i]+" ");
}
}
}