import java.util.*;
public class PrimeNum_Range_byUser_1_to_n {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two number upto print the prime number :");
    int x=sc.nextInt();
    int n=sc.nextInt();
    //int c=0;
    for(int i=x;i<=n;i++)
    { int c=0;
    for(int j=1;j<=i;j++)
    {   
        if(i%j==0)
        { 
         c++;
        }
    }
    if(c==2)
     System.out.println(i+" ");
    }
    
}
}
