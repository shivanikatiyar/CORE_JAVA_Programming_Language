class Adder{
static int sum(int a,int b){return a+b;}
static double sum(double a,double b){return a+b;}
static float sum(float a,float b){return a+b;}
static float sum(int a,long b){return a+b;}
static double sum(int a,double b){return a+b;}
static float sum(int a,long b,int c){return a+b+c;}
static double sum(int a,double b,double c){return a+b+c;}
}
class TestOverloading2{
public static void main(String[] args){
System.out.println(Adder.sum(12,12));
System.out.println(Adder.sum(12.3,12.6));
System.out.println(Adder.sum(12.1,12.3));
System.out.println(Adder.sum(13,12));
System.out.println(Adder.sum(13,12.5));
System.out.println(Adder.sum(13,12,56));
System.out.println(Adder.sum(13,12.4,56.8));
  }
}