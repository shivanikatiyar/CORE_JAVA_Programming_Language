/* https://www.hackerrank.com/challenges/30-review-loop/problem
Task
Given a string,S, of length N that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
Note:  is considered to be an even index.
Sample Input 2
Hacker
Rank
Sample Output
Hce akr
Rn ak  */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            char ar[]=a[i].toCharArray();
            for(int j=0;j<ar.length;j+=2)
            {
                System.out.print(ar[j]);
            }
              System.out.print(" ");
            for(int k=1;k<ar.length;k+=2){
                System.out.print(ar[k]);
                }
             System.out.println();
        }
    }
}