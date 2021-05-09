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
public class Set_using_hashset_Linkedhashset_TreeSet {

  public static void main(String args[]) { 
      String fruits[] = {"Apple","Kiwi","Mango","Banana"};
      Set<String> set = new HashSet<String>(); // Using Hashset class. not sequence order
      try {
         for(int i = 0; i < 4; i++) {
            set.add(fruits[i]);
         }
         System.out.println(set);

         Set lh = new LinkedHashSet<String>(set);  // using LinkedHashSet
         System.out.println("Print list Sequence order using LinkedHashSet :"+lh);
         
         TreeSet sortedSet = new TreeSet<String>(set); // Using TreeSet class.print sorted list
         System.out.println("The sorted list is using TreeSet class:");
         System.out.println(sortedSet);

         System.out.println("The First element of the set is: "+ (String)sortedSet.first());
         System.out.println("The last element of the set is: "+ (String)sortedSet.last());
      }
      catch(Exception e) {}
   }
} 
