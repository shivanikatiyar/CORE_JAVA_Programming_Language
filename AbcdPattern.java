import java.util.Scanner;
class AbcdPattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows :");
int n=sc.nextInt();
int i,j,k=65;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.printf("%c",k);
k++;
if(k>90){
k=65;}
}
System.out.print("\n");
}
}
}