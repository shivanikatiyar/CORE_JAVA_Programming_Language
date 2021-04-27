
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class File_Reading_2 {
        public static void main(String args[])throws IOException
    {   String data="";
        try
        {
            FileReader fr=new FileReader("myfile.txt");
            BufferedReader br=new BufferedReader(fr);
            while(true)
            {
            data=br.readLine();
            if(data==null)
                break;
            System.out.println(data+"\n");
            }
            br.close();
            fr.close();
        }
       catch(FileNotFoundException e){
            System.out.println("File not exit");
        }
    } 
}
