// Example of Type casting
public class TypeCast{
public static void main(String[] args){
int myintnum = 65;
double myDoublenum = myintnum; //Widening casting (automatically)
double myDouble = 9.23;
int myint = (int)myDouble; //Narrowing casting
System.out.println(myDouble);
System.out.println(myint);
System.out.println(myintnum);
System.out.println(myDoublenum);
   }
}