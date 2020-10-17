public class TernaryOperat 
{
public static void main(String[] args) {
int num = 45,b;
String a;
a = (num>45) ? "Success": "Unsucces";
System.out.println(a);
b = (num<=45) ? (num+20) : num;
System.out.println("Number is:"+b);
}
}