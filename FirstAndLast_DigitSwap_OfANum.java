import java.io.*;
class FirstAndLast_DigitSwap_OfANum
{
public static void main(String[] args)throws IOException
{
  InputStreamReader fl=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(fl);
  System.out.println("Enter the number :");
  int n=Integer.parseInt(br.readLine());
  int l,f,t,r=0,swap,c,d;
  l=n%10;
  t=n;
  while(n>10)
  {
	  n=n/10;
  }
  f=n;
  n=t/10;
  while(n>10)
  {
	  c=n%10;
	  r=r*10+c;
	  n=n/10;
  }
  swap=l;
  while(r>0)
  {
	  d=r%10;
	  swap=swap*10+d;
	  r=r/10;
  }
  swap=swap*10+f;
  System.out.println("First and Last digit of a number Swap :"+swap);
}
}
  
  
  
   