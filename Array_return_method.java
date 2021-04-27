public class Array_return_method {
    public int[] returnSort(int x[],int n)
    {
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n-i-1;j++)
            {
                if(x[j]>x[j+1])
                {
                    int temp;
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        return x;
    }
    public static void main(String [] args)
    {
        int arr[]={1,-23,5,6,67,23};
        Array_return_method obj=new Array_return_method(); // class object create
        int a[]=obj.returnSort(arr,arr.length);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
    
}
