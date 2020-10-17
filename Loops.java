public class Loops
{
public static void main(String args[])
{
int i=0,l,a[]={2,4,6,8,10};
l=a.length;
while(i<=5)
{
System.out.println("Hello While Loop:"+i);
i++;
}
i=0;
do
{
System.out.print("\nHello Do While Loop:"+a[i]);
}while(i>l);
for(i=2;i<5;i++)
{
System.out.println("Hello For Loop:"+i);
}
}
}