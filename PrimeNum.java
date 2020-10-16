import java.util.Scanner;
public class PrimeNum
{
static int isPrime(int num)
{
int i;
for(i=2;i<=num;i++)
{
if(num%i==0)
 {
   break;
 }
}
if(num==i)
{
return 1;
}
else
{
return 0;}
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number:");
int num = scan.nextInt();
int t = isPrime(num);
if(t==1)
{
System.out.println("Successful,Number is Prime.");}
else
{
System.out.println("Unsuccessful,Number is not Prime.");}
}
}
