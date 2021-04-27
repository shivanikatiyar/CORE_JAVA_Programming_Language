public class Armstrongnum_1_to_500 {
   public static void main(String[] args)
   {
    int digit1,digit2,digit3;
    int num,temp;
    for(num=1;num<=500;num++)
    {
       temp=num;
       digit1=temp%10;    // first digit number armstrong.
       
       temp=temp/10;
       digit2=temp%10;    // two digit number armstrong.
       
       temp=temp/10;
       digit3=temp%10;     // three digit number armstrong.
       
       if(digit1*digit1*digit1+ digit2*digit2*digit2+ digit3*digit3*digit3==num)
       {
           System.out.println(num);
       }
    }   
   }
}
