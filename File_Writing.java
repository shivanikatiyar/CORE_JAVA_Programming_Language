import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Writing {
    public static void main(String args[])throws IOException
    { 
        try
        {
           // FileWriter fr=new FileWriter("myfile.txt");
            FileWriter fr=new FileWriter("myfile.txt",true);// append mode-->fixed before written.(not change writting)
            BufferedWriter br=new BufferedWriter(fr);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter some data:");
            String data=sc.nextLine();
            br.write(data);
            br.write("\n");
            br.close();
            fr.close();
        }
       catch(FileNotFoundException e){
            System.out.println("File not exit");
        }
    }
}
