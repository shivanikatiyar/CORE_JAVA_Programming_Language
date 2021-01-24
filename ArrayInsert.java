import java.util.Scanner;
class ArrayInsert
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
System.out.println("Enter the element of array:");
int ele=sc.nextInt(); 
int a[]=new int[n];
int i;
for(i=0;i<ele;i++)
{
a[i]=sc.nextInt();
}
System.out.println("which position insert a element:");
int x=sc.nextInt();
System.out.println("Enter the number:");
int n2=sc.nextInt();
for(i=ele;i>=x-1;i--)
{
a[i]=a[i-1];
}
a[x-1]=n2;
System.out.println("Insert element Array :");
for(i=0;i<(ele+1);i++)
{
System.out.print(a[i]+" ");
}
}
}