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
public class Synchronized_thread {
    
    public static void main(String args[])
    {
        bank b=new bank(5000);
        bank b1=new bank(4000);
        Thread t1=new Thread(b,"shivani");// thread 1
        Thread t2=new Thread(b1,"pooja");// thread 2
        t1.start();
        t2.start();
    }
}
class bank implements Runnable // Using Runnable interface
{
    static int balance=5000;
    int amt;
    public bank(int amt){
        this.amt=amt;
    }
    public void run()
    {
        synchronized(this)
        {
            if(amt<=balance)
            {
                System.out.println(amt+"rs withdraw successfully by "+Thread.currentThread().getName());
                try
                {
                    Thread.sleep(2000);
                    balance=balance-amt;
                    
                    System.out.println("Available balance is: "+balance);
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else
            {
                System.out.println("insufficient balance");
            }
        }
    }
