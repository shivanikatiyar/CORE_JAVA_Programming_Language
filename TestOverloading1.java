class Adder{
static int sum(int a,int b){return a+b;}
static int sum(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
public static void main(String[] args){
System.out.println(Adder.sum(12,12));
System.out.println(Adder.sum(12,12,12));
  }
}