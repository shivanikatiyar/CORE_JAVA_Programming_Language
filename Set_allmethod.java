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
import java.util.*;
public class Set_allmethod {
    public static void main(String args[])
    {
        Set<Integer> x=new HashSet<>();
        x.add(23); 
        x.add(1);      
        x.add(16);
        Set<Integer> y=new HashSet<>();
        y.add(5); 
        y.add(1);   
        y.add(6);
        x.addAll(y);   // Union
        System.out.println(x);
        x.retainAll(y);   // intersection
        System.out.println(x);
         // x subset of y.
        System.out.println(x.containsAll(y));
            // Difference x-y.
        System.out.println(x.removeAll(y));
        System.out.println("Does the Set contains '91'?" + y.contains(91));   
        System.out.println("Does the Set contains 'javaTpoint'? " + y.contains("4"));  
        System.out.println("Does the Set contains '51'? " + y.contains(6));  
    }
    
}
