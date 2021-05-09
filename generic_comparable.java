/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell 3567 7i3
 */
public class generic_comparable {
        public static <T extends Comparable>void sum( T a,T b) // void-->(T)you want to return type.written T
    {
        System.out.println(a.compareTo(b));
       
    }
       public static void main(String args[])
    {
       genricmethod g=new genricmethod();
       g.sum(4,4);
        
}
    
}
