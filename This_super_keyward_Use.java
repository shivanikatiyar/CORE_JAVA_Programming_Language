public class This_super_keyward_Use {
 public static void main(String [] args)
 {
    B1 ojm=new B1();
    ojm.show(30);
 }
}
  class A2
    {
        int i=10;
    }
 class B1 extends A2
    {
       int i=20;
       void show(int i)
       {
         System.out.println(i);  // 30
        System.out.println(this.i); // 20 -->same class variable access
        System.out.println(super.i); // 10 -->parent class variable access
       }
    }
