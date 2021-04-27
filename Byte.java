import java.io.*;
import java.util.Arrays;
public class Byte {
    public static void main(String [] args)
    {
    try
    {
       File f1=new File("prime.java");
       long length=f1.length();
       byte bt[]=new byte[(int)length];
       System.out.println(Arrays.toString(bt));
}
    catch(Exception ex)
    {
        System.out.println(" "+ex);
    }
    }
}