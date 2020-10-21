//Enter the any String then check if string then print valid or invalid.
import java.util.Scanner;
public class StringCheck {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.printf("enter string :");
      String s =sc.next();
	  int flag=0;
	  for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)>='0'&&s.charAt(i)<='9')) 
		{
	    flag=1;
		break;
		}
	}
	 if(flag==1)
		System.out.println("String is invalid");
	 else
		System.out.println("String is valid");
  }
}
	
