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
//public class Interrupt_Thread {
    
//}
class TestInterruptingThread2 extends Thread{  
public void run(){  
try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
System.out.println("Exception handled "+e);  
}  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
TestInterruptingThread2 t1=new TestInterruptingThread2();  
t1.start();  
  
t1.interrupt();  
  
}  
}
