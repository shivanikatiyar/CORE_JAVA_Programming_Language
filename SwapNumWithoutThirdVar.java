import java.util.Scanner;
class SwapNumWithoutThirdVar
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the Two numbers : ");
int a=sc.nextInt();
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("a= "+a+" b= "+b);
}
}
