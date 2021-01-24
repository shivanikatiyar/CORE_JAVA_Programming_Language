import java.util.Scanner;
class ArrayEvenOdd_Max_and_Min
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
System.out.println("Enter the " +n+ " element of a array:");
int arr[]=new int[n];
int i,j,min=0,max=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{  
  if(arr[i]%2==0)
  System.out.println("Even:"+arr[i]);
  else
  System.out.println("Odd:"+arr[i]);
}
for(i=0;i<n;i++)
{
 max=arr[0];
 min=arr[0];
	for(j=1;j<n;j++)
	{
	if(arr[j]>max)
	{
	max=arr[j];	}
	}
	for(j=1;j<n;j++)
	{
	if(arr[j]<min)
	{
	min=arr[j];	}
	}
}
System.out.println("Maxmium :"+max);
System.out.println("Minimum :"+min);
}
}