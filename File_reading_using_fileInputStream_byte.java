/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Dell 3567 7i3
 */
public class File_reading_using_fileInputStream_byte {
        public static void main(String args[])throws IOException
    {
        try
        {
            FileInputStream fr=new FileInputStream("myfile_write_OutputStream.txt");
            BufferedInputStream br=new BufferedInputStream(fr); // InputStream read data in byte form.
            int data;
            while((data=br.read())!=-1)
            {
                System.out.print((char)data); // convert byte to (char)string.
            }
            System.out.println();
            br.close();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not exist");
        }
}
}