public class parent_child_pri_3_inheritance {
    public static void main(String [] args)
    {
        Parent obj1=new Parent(); // parent class object create
        obj1.par();              // parent class Method call
        Child obj=new Child();   // child class object create
        obj.par();               // parent class Method call by child class object.
        obj.chil();               // Child class Method call
    }
}
class Parent{
    public void par()  //private void par()---> method of the parent class as private and then repeat the first two operations(You will get error in the third).
    {
        System.out.println("This is Parent class");
    }
}
class Child extends Parent{
    public void chil()
    {
        System.out.println("This is child class");
    }
}