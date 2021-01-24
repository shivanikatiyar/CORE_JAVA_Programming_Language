import java.util.Scanner;
class HalfDiamondPrint
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows :");
int n=sc.nextInt();
int i,j,k;
for(i=1;i<=n;i++)
{
for(j=n;j>i;j--)
System.out.print(" ")
for(k=1;2*i-1>=k;k++)
System.out.print("* ");

for(j=n;j>i;j--)
System.out.print(" ");

System.out.printf("\n");
}
}
}
