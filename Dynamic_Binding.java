/*
 * In dynamic binding, the method call is bonded to the method body at runtime. This is also known as late binding. This is done using instance methods.
 */
package javaapplication2;
//public class Dynamic_Binding {
    
//}

class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}  
