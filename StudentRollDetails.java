import java.util.Scanner;
public class StudentRollDetails {
    public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int marks[][]=new int[2][2];
                int s=0,f=0;
                float p;
                for(int i=0;i<2;i++)
                {
                
                System.out.println("Enter details of student "+(i+1));
                for(int j=0;j<2;j++)
                {
                    System.out.println("Enter subject marks "+(j+1));
                           
                                marks[i][j]=sc.nextInt();
                            
                }
                
                }
                System.out.println("Enter the Rollno of student: ");
                int r=sc.nextInt();
                for(int i=0;i<2;i++)
                { 
                  f=0;
                 if((i+1)==r)
                 {
                 s=0;
                 f=1;
                System.out.println("All Details are:      Student marks   total sum  percentage(%) ");
                System.out.print("student Rollno : "+(i+1)+"\t");
                for(int j=0;j<2;j++)
                {
                    
                    s=s+marks[i][j];      
                    System.out.print(marks[i][j]+"\t");
  
          
                }
                System.out.print(s+"\t");
                p=s/2;
                System.out.print(p+"%");
                System.out.println();
                break;
                }
                }
                if(f==0)
                    System.out.println(r+" rollno student not present");
            }
}

