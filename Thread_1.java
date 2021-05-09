/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_1;

/**
 *
 * @author Dell 3567 7i3
 */
public class Thread_1 {
    public static void main(String args[])
    {
        //System.out.println(Thread.currentThread()); // current thread
        demo d=new demo(); 
        Thread t1=new Thread(d); // call predefind thread class
        t1.setName("Thread-1"); // thread name
        t1.setPriority(10);  // Priority->1 to 10. 1 is min and 10 is max.-->executed process depend in Priority.
        
        t1.start(); // start thread execution process.
    }
    
}
class demo extends Thread   // predefind class using Thread
{
    public void run() // predefind method run()--> written all code inside the method.
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread()+" printing "+i);
        }
    }
}

