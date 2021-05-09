/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell 3567 7i3
 */
public class Queue_method {
    /*The queue interface is provided in java.util package and it implements the Collection interface. The queue implements FIFO i.e. First In First Out. This means that the elements entered first are the ones that are deleted first.*/
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>(); // Queue is a interface not a class
        q.add(70);
        q.add(71);
        q.add(72);
        q.add(75);
        System.out.print("Queue(row) element : "+q+"\n");
        System.out.println("Top element in a Queue : "+q.element());    //element()method (return top ele.)--> Throws:NoSuchElementException --> if this queue is empty 
        System.out.println("Peek(top) element in a Queue : "+q.peek()); // peek()method (return top ele.)-->but not throw exception ->return null -->if this queue is empty
        //Offer()-->Returns:true if the element was added to this queue, else false.//offer().
        System.out.println(q.offer(5));  //offer() method.
        System.out.println("After add element(5) : "+q);
        //public E remove()Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
        System.out.println("Delete head(top) element in Queue : "+q.remove());
        System.out.println("After deletion head element : "+q);
        // pull()-->Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(q.poll());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("After deletion head element : "+q);
        System.out.println("The size of the queue is: " +q.size());
    }
}
