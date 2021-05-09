/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell 3567 7i3
 */
import java.util.*;
public class LinkedList_method {
   public static void main(String args[]) {
      // create a linked list
      LinkedList ll = new LinkedList();
      // add elements to the linked list
      ll.add('c');
      //System.out.print(ll.getClass());
      ll.add('B');
      ll.add(1);
      
      ll.add("E");
      ll.add("C");
      ll.addLast("Z");
      ll.addFirst("A");
      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);
      // remove elements from the linked list
      ll.remove("F");
      ll.remove(2);
      System.out.println("Contents of ll after deletion: " + ll);
      System.out.println("size of list:"+ll.size());
      Iterator i=ll.iterator();    //descendingIterator order list
      while(i.hasNext())
      {
           System.out.print(i.next()+" ");
      }
      System.out.println();
       //remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("ll after deleting first and last: " + ll);
      // get and set a value
      Object val = ll.get(2); // get()
      System.out.println("get method at index 2 element: "+val);
      System.out.println(ll.get(3));// get()
      ll.set(2,"U");   // set()
      ll.set(1,val+" change"); // set()
      System.out.println("ll after change: " + ll);
      //ll.clear();   // clear() method delete all element 
      System.out.println("index of element : "+ll.indexOf("U"));// indexOf()
      System.out.println("list is empty or not:"+ll.isEmpty()); //if list empty return ture.-->isEmpty()
      System.out.println("contains : "+ll.contains("U"));// contains() method
      System.out.println("return first element :"+ll.element());//return this method first(head) element. 
      
   }
}
