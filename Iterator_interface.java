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
/*import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;*/
import java.util.*;

public class Iterator_interface {

   public static void main(String[] args) throws ClassNotFoundException {
      Vector<Integer> vector = new Vector<>();
      vector.add(1);vector.add(2);vector.add(3);
   
      System.out.println("Vector: ");
      Enumeration<Integer> enumeration = vector.elements();
      while(enumeration.hasMoreElements()){
         System.out.print(enumeration.nextElement() + " ");
      }

      List<Integer> list = new ArrayList<Integer>();
      list.add(1);list.add(2);list.add(3);

      System.out.println("\nList: ");
      Iterator<Integer> iterator = list.iterator();
      while(iterator.hasNext()){
         System.out.print(iterator.next() + " ");
      }

      System.out.println("\nList using ListItertor (Forward): ");
      ListIterator<Integer> listIterator = list.listIterator();
      while(listIterator.hasNext()){
         System.out.print(listIterator.next() + " ");
      }
      System.out.println("\nList using ListItertor (Backward): ");
      while(listIterator.hasPrevious()){
         System.out.print(listIterator.previous() + " ");
      }
   }
}