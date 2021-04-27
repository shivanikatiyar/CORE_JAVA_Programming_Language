/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temp*/
package javaapplication2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//import javaapplication2.File_Reading_2;
public class File_writing_using_fileOutputStream_byte {
    public static void main(String args[])throws IOException
    {
        try       // C:\Users\Dell 3567 7i3\Desktop\notepadJAVA\java file
        {
            FileOutputStream fr=new FileOutputStream("myfile_write_OutputStream.txt");
           // FileOutputStream fr=new FileOutputStream("C:\\Users\\Dell 3567 7i3\\Desktop\\notepadJAVA\\java file\\myfileinnote.txt"); // OutputStream-->write data in byte form --> multiple type file stored ex- .txt,.png,.jpg,mp3,mp4..etc. 
            BufferedOutputStream br=new BufferedOutputStream(fr); 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the some data:");
            String s=sc.nextLine();
            byte arr[]=s.getBytes(); // getBytes()--> method convert string to byte code and return array type in byte.
            br.write(arr);
            br.write(13);      // 13 is ascii value of enter keyword.
        /* for(byte b:arr)
          {
              System.out.print(b+"\t");
          }*/
            br.close();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not exits");
        }
    }
}

