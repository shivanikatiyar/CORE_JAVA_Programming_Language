import java.io.File;
public class Search {
    public static void main(String [] args)
    {
       File f1=new File("prime.java");
        if(f1.exists())
        {
            System.out.println("The directory or file exits.\n");
        }
        else
            System.out.println("The directory or file does not exits.\n"); 
    }
}
