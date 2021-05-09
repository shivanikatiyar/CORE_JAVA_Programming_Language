/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_1;

import java.util.Scanner;

/**
 *
 * @author Dell 3567 7i3
 */
//public class Thread_4 {
//}
class ThreadExample1 extends Thread { 
    
      Scanner sc=new Scanner(System.in);
     // run() method to perform action for thread. 
    
     public void run()  
     {  
        System.out.println("Enter the two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your operation :");
        System.out.println("1.+\n2.-\n3.*\n4./");
        int choice=sc.nextInt();
        switch(choice){   
        case 1:{ 
        int result = a+b;  
        System.out.println("Thread started running..");  
        System.out.println("Sum of two numbers is: "+ result);
        break;
        }
        case 2:{ 
        int result = a-b;  
        //System.out.println("Thread started running..");  
        System.out.println("Subtraction of two numbers is: "+ result);
        break;
        }
        case 3:{ 
        int result = a*b;  
        //System.out.println("Thread started running..");  
        System.out.println("Multiplecation of two numbers is: "+ result);
        break;
        }
        case 4:{ 
        int result = a/b;  
        System.out.println("Thread started running..");  
        System.out.println("division of two numbers is: "+ result);
         break;
        }
        default:
        {
           System.out.println("exit");
           break;
        }
        }  
     }  
     public static void main( String args[] )  
     {  
      // Creating instance of the class extend Thread class  
        ThreadExample1 d = new  ThreadExample1();  
        //calling start method to execute the run() method of the Thread class
        //Thread t1=new Thread(d); // call predefind thread class
        //t1.setName("Thread-1"); // thread name
        //t1.setPriority(10);
        d.start();  
     }  
}  
