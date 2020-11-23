import java.util.Scanner;
public class TowerOfHanoiRecursion
{
public void Toh(int n,String beg,String aux,String end)
{
   if(n==1){
   System.out.println("Disk 1 from " +beg+ " to " +end );}
   else{
   Toh(n-1,beg,end,aux);
   System.out.println("Disk " +n+ " from " +beg+ " to " +end );
   Toh(n-1,aux,beg,end);  
   }
}
public static void main(String[] args){
      TowerOfHanoiRecursion tower=new TowerOfHanoiRecursion();
	  System.out.println("Enter the Number of Discs:");
	  Scanner s=new Scanner(System.in);
	  int discs=s.nextInt();
	  tower.Toh(discs,"A","B","C");  }  // beg-->A,aux-->B,end-->C
	  }