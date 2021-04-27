import java.util.*;
public class EvenOdd_inArray_givenArray {
    public int[] even(int n) {
        int num1=n;
        int count=0,rem=0,e=0,r2=0;
        while(num1!=0)
        {   
            r2=num1%10;
            if(r2%2==0){
             count++;
            }
           num1=num1/10;
        }
        int a[]=new int[count];
        int n1=n;
        while(n1>0)
        {  
            rem=n1%10;
            
            if(rem%2==0)
            {
              a[e]=rem;
              e++;
            }
            n1=n1/10;
        }
        return a;
    }
       public int[] odd(int n)
       {
         int num=n;
         int n2=num;
         int count=0,r2=0,r=0,od=0;
        while(num!=0)
        {
            r2=num%10;
            if(r2%2!=0){
             count++;
            }
            num=num/10;
        }
        int b[]=new int[count]; 
        while(n2>0)
        {  
            r=n2%10;
            
            if(r%2!=0)
            {
            b[od]=r;
            od++;
            }
            n2=n2/10;
            }  
       
       return b;
       }
     public static void main(String args[])
    {
     EvenOdd_inArray_givenArray obj=new EvenOdd_inArray_givenArray();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int nm[]=obj.even(n);
      int m[]=obj.odd(n);
      System.out.println("Even number :");
      for(int i=0;i<nm.length;i++)
      {
          System.out.println(nm[i]);
      }
      System.out.println("Odd number :");
      for(int i=0;i<m.length;i++)
      {
          System.out.println(m[i]);
      }
    }
}
