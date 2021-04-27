import java.util.*;
public class Arrary_Frequency {
  public void frequn(int a[])
  {
      int count=1;
      int b[]=new int[a.length]; // stored freq.
      for(int i=0;i<a.length;i++)
      {    count=1;
           if(a[i]!=-1){
          for(int j=i+1;j<a.length;j++)
          {
              if(a[i]==a[j])
              {
                  count++;
                  a[j]=-1;
              }  
          }
          b[i]=count;
          }  
      }
      for(int i=0;i<a.length;i++)
      {
          if(a[i]!=-1)
          {
              System.out.println(" Frequency "+a[i]+ " = "+b[i]);
          }
      }
  }
  public static void main(String args[])
  {
     Arrary_Frequency obj=new Arrary_Frequency();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=sc.nextInt();
      System.out.println("Enter the array elements:");
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
         ar[i]=sc.nextInt();
      }
      obj.frequn(ar); 
  }
}
