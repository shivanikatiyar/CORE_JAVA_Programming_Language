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

    
 class static_binding {  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  static_binding d1=new static_binding();  
  d1.eat();  
 }  
}  

