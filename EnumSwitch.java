import java.util.Scanner;
enum Type{
EVEN,
ODD
}
public class EnumSwitch 
{
public static void main(String[] args){
	Type t;
Scanner myobj = new Scanner(System.in);
System.out.println("Enter the Number Between 1 to 100:");
int num = myobj.nextInt();
if(num%2==0)
	t=Type.EVEN;
else
	t=Type.ODD;
switch(num%2){
case 0:
System.out.println("The number is :"+t.EVEN);
break;
case 1:
System.out.println("The number is:"+t.ODD);
break;
}
}
}
