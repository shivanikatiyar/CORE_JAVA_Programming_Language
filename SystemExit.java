import java.lang.*;
public class SystemExit{	
public static void main(String[] args)
{
System.out.println("Program will terminate when i is 3");
for(int i=10;i>2;i--)
{
System.out.println("Your number is::"+i);
if(i==3)
{
System.out.println("Value is 3 now Terminating your program");
System.exit(1);                              // Exit Program ---> Use in System.exit(1)
}
} 
}
}