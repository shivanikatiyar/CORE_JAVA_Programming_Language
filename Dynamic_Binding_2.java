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
class Continent {
public void locate () {
System.out.println("We are in Continent");
}
}
class SubContinent extends Continent {
@Override
public void locate () {
System.out.println("We are in SubContinent");
}
}
public class Dynamic_Binding_2 {
public static void main(String args[]) {
Continent superObject = new Continent ();
superObject.locate(); //method of super class or parent class is called
SubContinent subObject = new SubContinent (); // upcasting
subObject.locate();//method of sub class or child class is called by Parent reference, this is called "Dynamic Binding"
SubContinent subObject2 = new SubContinent ();
subObject2.locate(); //method of sub class or child class is called
}
}
