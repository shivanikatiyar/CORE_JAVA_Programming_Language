import java.util.Scanner;
class ArrayReverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
System.out.println("Enter the " +n+ " element of a array:");
int arr[]=new int[n];
int i;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Reverse Array :");
for(i=n-1;i>0;i--)
{
  System.out.println(arr[i]);
}
}
}