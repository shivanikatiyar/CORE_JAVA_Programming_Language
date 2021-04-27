import java.util.Scanner;
// Ugly number is prime no. 2,3,5 facter only.
public class UglyNumbers {
	public static void main(String[] args)
	{
	// create object of scanner class.
	Scanner sc = new Scanner(System.in);
	// enter the positive number
	System.out.print("Enter the number : ");
	int n = sc.nextInt();  		
	if (n <= 0)
	{
	System.out.print("Enter correct/+ve number.");
	}
	int x = 0;
	while (n != 1)
	{
	// loop to obtain the result.
	if (n % 5 == 0)
	{
	n /= 5;
	}
	else if (n % 3 == 0) 
	{
	n /= 3;
	}
	else if (n % 2 == 0)
	{
	n /= 2;
	}
	else
	{
	System.out.print("The given number is not a ugly number.");
	x = 1;
	break;
	}
	}
	if (x==0)
       System.out.print("The given number is an ugly number.");
       System.out.print("\n");
	}
}

