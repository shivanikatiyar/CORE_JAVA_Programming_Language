import java.util.Scanner;
import java.util.Random;
class GuessRandomNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int ans,guess;
final int MAX=100;
Random rand=new Random();
boolean correct=false;
ans=rand.nextInt(MAX)+1;
while(!correct){
System.out.println("Guess a number between 1 to 100:");
guess=sc.nextInt();
if(guess>ans){
System.out.println("Too high,Try again");}
else if(guess<ans){
System.out.println("Too low,Try again");}
else{
System.out.println("Yes,you guessed the number.");
correct=true;}
}
System.exit(0);
}
}