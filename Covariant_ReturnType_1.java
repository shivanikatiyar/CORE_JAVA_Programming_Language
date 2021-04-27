/*Covariant return type refers to return type of an overriding method. It allows to narrow down return type of an overridden method without any need to cast the type or check the return type. Covariant return type works only for non-primitive return types.

From Java 5 onwards, we can override a method by changing its return type only by abiding the condition that return type is a subclass of that of overridden method return type.*/
package javaapplication2;

/**
 *
 * @author Dell 3567 7i3
 */
//public class Covariant_ReturnType_1 {
    class SuperClass {
   SuperClass get() {  // overriding method-->return class SuperClass
      System.out.println("SuperClass");
      return this;
   }
}
public class Covariant_ReturnType_1 extends SuperClass {
   Covariant_ReturnType_1 get() {   // overriding method-->return class Covariant_ReturnType_1
      System.out.println("SubClass");
      return this;
   }
   public static void main(String[] args) {
      SuperClass tester = new Covariant_ReturnType_1();
      tester.get();
   }
}
