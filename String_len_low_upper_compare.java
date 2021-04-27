/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class String_len_low_upper_compare {
    public static void main(String[] args)
    {
        String s1="JAVATPOINT";
        String s2="hackerrank";
        String s3="java is a object oriented language";
        String s4="hackerrank";
        String s5="javatpoint";
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.indexOf("object"));
        System.out.println(s1+" "+s2);  // concatention string
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s5));
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.charAt(4));
        String s6="hello";
        String s7="HELLO";
        System.out.println(s6.compareTo(s7));
        byte a[]=s1.getBytes();
        for(byte b:a)
        System.out.println(b);
    }
    
}
