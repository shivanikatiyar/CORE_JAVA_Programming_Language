/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Dell 3567 7i3
 */
//public class Covariant_ReturnType_2 {
    
class A{
A get(){return this;} //return class A.
}
class B1 extends A{
B1 get(){return this; } //return class B1.
void message(){System.out.println("welcome to covariant return type");}

public static void main(String args[]){
new B1().get().message();
}
}

