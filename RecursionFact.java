import java.util.Scanner;
public class RecursionFact
{
static int factorial(int n)
{
if(n==1)
return 1;
else
return(n*factorial(n-1));
}
public static void main(String[] args)
{
Scanner fact = new Scanner(System.in);
System.out.println("Enter the Number:");
int num = fact.nextInt();
System.out.println(factorial(num));
}
}