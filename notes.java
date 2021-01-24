import java.util.Scanner;            // Count no of Notes in total amount
class notes
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the total amount :");
int n =sc.nextInt();
int n2000,n500,n100,n200,n50,n20,n10,n5,n2,n1,t;
n2000=n/2000;
n=n%2000;
n500=n/500;
n=n%500;
n200=n/200;
n=n%200;
n100=n/100;
n=n%100;
n50=n/50;
n=n%50;
n20=n/20;
n=n%20;
n10=n/10;
n=n%10;
n5=n/5;
n=n%5;
n2=n/2;
n=n%2;
n1=n/1;
n=n%1;
System.out.println("2000*"+n2000+"="+n2000*2000);
System.out.println("500*"+n500+"="+n500*500);
System.out.println("200*"+n200+"="+n200*200);
System.out.println("100*"+n100+"="+n100*100);
System.out.println("50*"+n50+"="+n50*50);
System.out.println("20*"+n20+"="+n20*20);
System.out.println("10*"+n10+"="+n10*10);
System.out.println("5*"+n5+"="+n50*5);
System.out.println("2*"+n2+"="+n20*2);
System.out.println("\n1*"+n1+"="+n10*1);
t=n2000+n500+n100+n200+n50+n20+n10+n5+n2+n1;
System.out.println("Total Minimum Notes : "+t);
}}