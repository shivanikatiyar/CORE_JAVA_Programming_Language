import java.util.Scanner;
              // KaprekarNum --> a no. whose square divide into two parts and sum of the parts is equal to the original no. ex.-->9->9*9->81->8+1=9.
public class KaprekarNum {
    public static void main(String [] args){
        int count=0;
        boolean b=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int sq_num=num*num;
        while(sq_num!=0){
            count++;
            sq_num/=10;
        }
       sq_num=num*num;
       for(int i=0;i<count;i++){
           int n=(int)Math.pow(10, i);
           if(num==n)
               continue;
           
      int res=sq_num%(int)Math.pow(10,i)+sq_num/(int)Math.pow(10,i);
      if(res==num)
      {
          b=true;
      }
      }
       if(b){
           System.out.println("Kaprekar number");
       }
       else
           System.out.println("Not a Kaprekar number");
    }

}
