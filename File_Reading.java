package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_Reading {
       public static void main(String args[])throws IOException
    {
        try
        {
            FileReader fr=new FileReader("myfile.txt");
            BufferedReader br=new BufferedReader(fr);
            String data=br.readLine();
            System.out.println(data);
            br.close();
            fr.close();
        }
       catch(FileNotFoundException e){
            System.out.println("File not exit");
        }
    } 
}
