/*public class Abstract_Q_2_Bank {
    public static void main(String [] args)
    {
        BankA a1=new BankA();
        a1.getBalance();
        BankB a2=new BankB();
        a2.getBalance();
        BankC a3=new BankC();
        a3.getBalance();
    }
}
abstract class Bank
{
    protected abstract void getBalance();
}
 class BankA extends Bank
{
    public void getBalance()
    {
        int a=100;
        System.out.println("Deposit by Bank A = "+a+"$");
    }  
}
 class BankB extends Bank
{
    public void getBalance()
    {
        int a=150;
        System.out.println("Deposit by Bank B = "+a+"$");
    }  
}
 class BankC extends Bank
{
    public void getBalance()
    {
        int a=200;
        System.out.println("Deposit by Bank C = "+a+"$");
    }  
}