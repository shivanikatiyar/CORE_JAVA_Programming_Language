import java.util.Scanner;
class FullDiamondPrint
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows :");
int n=sc.nextInt();
int i,j,k,l,r,q;
for(i=1;i<=n;i++)
{
for(j=n;j>i;j--)
System.out.print(" ");

for(k=1;2*i-1>=k;k++)
System.out.print("*");

for(j=n;j>i;j--)
System.out.print(" ");

System.out.printf("\n");
}
for(r=1;r<n;r++)
{
for(q=1;r>=q;q++)
System.out.print(" ");

for(l=r;2*n-r-1>l;l++)
System.out.print("*");

for(q=1;q<=r;q++)
System.out.print(" ");

System.out.printf("\n");
}
}
}