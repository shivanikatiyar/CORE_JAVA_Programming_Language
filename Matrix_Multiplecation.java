import java.util.*;
public class Matrix_Multiplecation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first matrix");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        System.out.println("Enter the size of second matrix");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int a[][]=new int[n1][m1];
        int b[][]=new int[n2][m2];
        int c[][]=new int[n1][m2];
        if(m1==n2)
        {
            System.out.println("Enter the first matrix element");
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the second matrix element");
            for(int i=0;i<n2;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n1;i++)
            {
             for(int j=0;j<m2;j++){
                  c[i][j]=0;  
             for(int k=0;k<m1;k++)
                {   
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
            }
            System.out.println("Multiplecation Matrix : ");
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++){
                System.out.print(c[i][j]+" ");   
            }
                System.out.println();
           }
        }
        else
           System.out.println("It is not possible in multiplecation");
    }    
}
