// Example of method overriding
class Vehicle {              // parent class
void run(){                 // defining a method
System.out.println("Vehicle is running");
}}
class Bike2 extends Vehicle{   //child class
void run(){
System.out.println("Bike is running safely");
}
public static void main(String args[])
{
Bike2 obj = new Bike2();     //creating object
obj.run();                  // calling method
 }
}
