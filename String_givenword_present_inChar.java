import java.util.*;
public class String_givenword_present_inChar {
    
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String a=sc.nextLine();
    System.out.println("Enter a Character : ");
    char b=sc.next().charAt(0);
    boolean isbool=false;
    for(int i=0;i<a.length();i++)
    {
      isbool=false;
      char c=a.charAt(i);     
      if(b==c){
      isbool=true;
        break;
      }
    }
    if(isbool){
        System.out.println(b+" present in word");}
    else{
        System.out.println(b+" is not present in word");
    }
       
   }   
}
