public class Enum_constructor_method {

enum resturant {  //--> inside class  //enum always declare inside or outside in class ,, enum can not declare in main method  
   
    POHA,PIZZA,IDLI,DOSA,BURGER; //(const) object not a string
    private resturant() // Constructor
    {
        System.out.println("Constructor of "+this.toString());
    }
    void print()  // method
    {
        System.out.println("Method called for enum");
    }
}
 public static void main(String args[]) 
   {
       resturant r=resturant.BURGER;
       System.out.println(r);
       r.print();
   }
}
