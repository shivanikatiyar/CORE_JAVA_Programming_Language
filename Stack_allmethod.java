/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Dell 3567 7i3
 */
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;  
public class Stack_allmethod 
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// Access element from the top of the stack using peek() method 
int p = stk.peek();  
//prints stack  
System.out.println("Element at top: " +p); 
// Search an element using search() method  
int location = stk.search(113);  
System.out.println("Location of 113 element: " + location);  
// Find the size of the Stack  
int x=stk.size();  
System.out.println("The stack size is: "+x); 
// using iterator
Iterator iterator = stk.iterator();  
while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
} 
//using ListIterator
ListIterator<Integer> li = stk.listIterator(stk.size());  
System.out.println("Iteration over the Stack from top to bottom:");  
while (li.hasPrevious())   
{  
Integer avg = li.previous();  
System.out.println(avg);  
}
}  
}  
