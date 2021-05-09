/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Dell 3567 */

import java.util.*; 
  
class HashSet_class_method { 
  
    // Main Method 
    public static void main(String[] args) 
    { 
        HashSet<String> h = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India"); // adding duplicate elements 
        h.add(null); // adding null
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:"
                           + h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"
                           + h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
        // isEmpty();
         System.out.println(h.isEmpty());
    } 
}
