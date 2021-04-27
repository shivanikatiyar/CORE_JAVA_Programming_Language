/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//import javaapplication2.File_Reading_2;
/**
 *
 * @author Dell 3567 7i3
 */
public class File_read_line_word {
    public static void main(String args[])throws IOException
    { String data="";
       int line=0,w=0,c=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the file name"); //C:\\Users\\Dell 3567 7i3\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\File_Reading_2.java
       //System.out.println(" C:\\Users\\Dell 3567 7i3\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\");
       String name=sc.nextLine();
        try
        {
            FileReader fr=new FileReader(name);
            BufferedReader br=new BufferedReader(fr);
            while((data=br.readLine())!=null){
             System.out.println(data);
            line++;
            c=data.length();
            for(int i=0;i<data.length();i++)
            {
                if(data.charAt(i)==' ')
                {
                    w++;
                }
            }
            }
            System.out.println("No of word "+(w+line));
            System.out.println("No of line "+line);
            System.out.println("No of character "+c);
            br.close();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
           System.out.println("File not exits");
        }
    }   
}
