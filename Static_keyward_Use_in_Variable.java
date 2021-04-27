public class Static_keyward_Use_in_Variable {
  static int a=0;   // static variable --> only one time memory allocate
  int b=0;    // instance variable
  void dis()
  {
      int c=0;  // local variable ---> can not use static keyward
      c++;
      a++;
      b++;
      System.out.println("a= "+a);
      System.out.println("b= "+b);
      System.out.println("c= "+c);
  }
  public static void main(String [] args)
  {
      Static_keyward_Use_in_Variable ob=new Static_keyward_Use_in_Variable();
      ob.dis();
      ob.dis();
      Static_keyward_Use_in_Variable ob1=new Static_keyward_Use_in_Variable();
      ob1.dis();
      System.out.println(a);
  }  
}
