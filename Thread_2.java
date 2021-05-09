/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell 3567 7i3
 */
public class Thread_2 {
    public static void main(String args[])
    {
        //System.out.println(Thread.currentThread()); // current thread
        demo d=new demo(); 
        Thread t1=new Thread(d); // call predefind thread class
        t1.setName("Thread-1"); // thread name
        t1.setPriority(10);  // Priority->1 to 10. 1 is min and 10 is max.-->executed process depend in Priority.
        Thread t2=new Thread(d); // call predefind thread class
        t2.setName("Thread-2"); // thread name
        t2.setPriority(10);
        t1.start();
        t2.start(); // start thread execution process.
    }
    
}
class demo extends Thread   // predefind class Thread
{
    public void run() // predefind method run()--> written all code inside the method.
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread()+" printing "+i);
            try {
                Thread.sleep(1000); // 1000 mili second rest.
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}  

