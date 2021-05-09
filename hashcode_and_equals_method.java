/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.LinkedList;

/**
 *
 * @author Dell 3567 7i3
 */
public class hashcode_and_equals_method {
    public static void main(String args[])
    {
        //LinkedList<String>li=new LinkedList<String>();
        String a ="apple";
        String b ="apple";
        String c ="banana";
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println("Hashcode a = "+a.hashCode());
        System.out.println("Hashcode b = "+b.hashCode());
        System.out.println("Hashcode c = "+c.hashCode());
    }    
}
