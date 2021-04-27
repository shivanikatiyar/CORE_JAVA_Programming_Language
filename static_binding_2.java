/*
 * 
 */
package javaapplication2;

/**
 *
 * @author Dell 3567 7i3
 */
public class static_binding_2 { 
    public static class superclas { 
        static void print() 
        { 
            System.out.println("print in superclass."); 
        } 
    } 
    public static class subclas extends superclas { 
        static void print() 
        { 
            System.out.println("print in subclass."); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        superclas A = new superclas(); 
        superclas B = new subclas(); 
        A.print(); 
        B.print(); 
    } 
} 



