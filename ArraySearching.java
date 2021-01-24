import java.util.*;
class ArraySearching
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
System.out.println("Enter the " +n+" of array:");
int a[]=new int[n];
int i,f=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the number you want to search in a array:");
int x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{f=1;
System.out.println(+x+" present in "+(i+1)+"th position in a array");
}
}
if(f==0)
{
System.out.println(+x+" is not present in a array");}
}
}
