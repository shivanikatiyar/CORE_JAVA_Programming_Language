public class SysExit
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<a.length;i++)
{
if(a[i]>=5)
{
System.out.println("exit..."); //Terminate JVM 
System.exit(0);                //Use System.exit(0)--->Terminate Successfully(no error)
}
else
System.out.println("a["+i+"]="+a[i]);
}
System.out.println("End of Program");
}
}
