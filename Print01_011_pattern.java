import java.util.Scanner;
class Print01_011_pattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows :");
int n=sc.nextInt();
int i,n1=0,n2=1,c,j;
System.out.println(n1);
for(i=0;i<n;i++)
{
	n1=0;
	n2=1;
	System.out.printf("%d %d ",n1,n2);
	for(j=0;j<i;j++)
	{
	c=n1+n2;
    System.out.printf("%d ",c);
	n1=n2;
	n2=c;
	}
 System.out.printf("\n");
}	
}
}


