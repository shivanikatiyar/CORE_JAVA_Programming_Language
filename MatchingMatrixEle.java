import java.util.Scanner;
public class MatchingMatrixEle{
    
    public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int a[][]=new int[2][2];
                int b[][]=new int[2][2];
                int c[]=new int[4];
                System.out.println("Enter the first Matrix :");
                for(int i=0;i<2;i++)
                {
                
                System.out.println("Enter the "+(i+1)+" row");
                for(int j=0;j<2;j++)
                {
                    System.out.println("Enter the col element "+(j+1));
                           
                                a[i][j]=sc.nextInt();
                            
                }
                }
                System.out.println("Enter the Second Matrix :");
                for(int i=0;i<2;i++)
                {
                
                System.out.println("Enter the "+(i+1)+" row");
                for(int j=0;j<2;j++)
                {
                    System.out.println("Enter the col element "+(j+1));
                           
                                b[i][j]=sc.nextInt();
                            
                }
                }
                System.out.println("Print matching matrix :");
                int d=0;
                for(int i=0;i<2;i++)
                {
        
                for(int j=0;j<2;j++)
                {
                  if(a[i][j]==b[i][j]) 
                  {
                   c[d]=a[i][j];
                   d++;
                  }
               
                }}
                for(int i=0;i<d;i++)
                      System.out.print(c[i]+"\t");
                
            }
}

