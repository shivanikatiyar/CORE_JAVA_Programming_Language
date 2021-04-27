import java.util.*;
//Write a method calculating the sum of an array using recursion.
public class Array_sum_using_recursion {
    public int sumOfArray(int[] a, int n) {
      if(n==0)
          return 0;
      return a[n-1]+sumOfArray(a, n-1);
}
    public static void main(String [] args)
    {  
        Array_sum_using_recursion obj=new Array_sum_using_recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array element :");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(obj.sumOfArray(a,n));
    }
}
