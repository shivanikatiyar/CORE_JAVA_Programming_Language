
import java.util.Scanner;


public class array2d
{
    public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int marks[][]=new int[2][2];
                int s=0;
                float p;
                for(int i=0;i<2;i++)
                {
                
                System.out.println("Enter details of student "+(i+1));
                for(int j=0;j<2;j++)
                {
                    System.out.println("Enter sub "+(j+1));
                           
                                marks[i][j]=sc.nextInt();
                            
                }
                
                }
                System.out.println("All Details are:\n");
                System.out.println("              Student marks    total sum    percentage(%) ");
                 for(int i=0;i<2;i++)
                {
                 s=0;
             
                System.out.print("student "+(i+1)+":\t");
                for(int j=0;j<2;j++)
                {
                    
                    s=s+marks[i][j];      
                    System.out.print(marks[i][j]+"\t");
                            
                }
                System.out.print(s+"\t");
                p=s/2;
                System.out.print(p+"%");
                System.out.println();
                }
            }
}
