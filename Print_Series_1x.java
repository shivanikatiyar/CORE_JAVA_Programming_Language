import java.util.Scanner;
class SeriesPrint
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to upto print Series :");
int n=sc.nextInt();
int i,x=1,fact=1;
float a=0;
for(i=1;i<=n;i++)
{fact=fact*i;
a=a+(float)Math.pow(x,i)/fact;
}
System.out.println(a);
}
}
