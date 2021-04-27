
package javaapplication2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class copyfile {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String data="";
        String alldata="";
        System.out.println("Enter source file name: ");
        String source=sc.next();
        try
        {
        FileReader fr=new FileReader(source);
        BufferedReader br=new BufferedReader(fr);
        while(true)
        {
            data=br.readLine();
            
            if(data==null)
            {
                System.out.println("copy complete");
                break;
            }
            alldata=alldata.concat(data);
        }
        for(int i=0;i<args.length;i++)
        {
            FileWriter fw=new FileWriter(args[i],true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(alldata);
            System.out.println((i+1)+" file copy");
            bw.close();fw.close();
        }
        }
    catch(FileNotFoundException e)
    {
        System.out.println("File not exist");  
    }
    catch(IOException e)
    {
        System.out.println("data not awailable to read");
    }
            
     
        
    }
    
    
    
}
