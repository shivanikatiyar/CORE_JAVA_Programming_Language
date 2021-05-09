/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_1;

/***/
public class InterThraed_Communication_synchro {
    public static void main(String args[]){
        bank1 b=new bank1();
        Thread t1=new Thread(){public void run(){b.withdraw(1500);}};
        t1.start();
        Thread t2=new Thread(){public void run(){b.deposit(1000);}};
        t2.start();  
    }
}
class bank1
{
    static int amt=1000;
    synchronized void withdraw(int amt)
    {
        System.out.println("we are in withdraw.");
        if(amt>this.amt){
           System.out.println("waiting for deposite amt insufficiant");
           try{
               wait();
           }
           catch(Exception e){
               System.out.println(e.getMessage());
           }
           System.out.println("amt withdraw successfuly");
           System.out.println("balance="+(this.amt-amt));
        }
    }
    synchronized void deposit(int amt) {
        System.out.println("we are in deposit.");
        this.amt+=amt;
        System.out.println(amt+" creadited successfully");
        notify();
       }
}
