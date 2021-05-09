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
public class Deadlock_occer_in_synchronige_thread {
    public static void main(String args[])
    {
        Object t=new Object();// Object is a predefind class,t-->seat type 
        Object com=new Object();
        bookticket b=new bookticket(t,com);
        cancelticket c=new cancelticket(t,com);
        Thread t1=new Thread(b);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
    }
}
class cancelticket extends Thread
{
    Object seat,comp; // class object variable
    public cancelticket(Object seat,Object comp)
    {
        this.seat=seat;
        this.comp=comp;
    }
    public void run()
    {
        synchronized(comp) // deadlock not occer change comp-->seat.
        {
            System.out.println("cancel ticket lock on comp");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("cancel ticket waiting to lock seat");
            synchronized(seat) // deadlock not occer change seat-->comp.
            {
                System.out.println("cancelticket lock on seat");
            }
        }
    }   
}
class bookticket extends Thread           
{
    Object seat,comp; // class object variable
    public bookticket(Object seat,Object comp)
    {
        this.seat=seat;
        this.comp=comp;
    }
    public void run()
    {
        synchronized(seat)
        {
            System.out.println("Book ticket lock on seat");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("bookticket waiting to lock compartment");
            synchronized(comp)
            {
              System.out.println("Book ticket lock on compartment");
            }
        }
    }   
}

