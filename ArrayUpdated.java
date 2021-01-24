import java.util.*;
class ArrayUpdated
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
System.out.println("Enter the position of element you want to update a array:");
int x=sc.nextInt();
System.out.println("Enter the number :");
int n1=sc.nextInt();
for(i=0;i<n;i++)
{
if((i+1)==x)
{ 
a[i]=n1;}
}
System.out.println("Update Array :");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}