//constructor Overloading
class StudentId{
int rollno;
String name;
char section;
String address;
StudentId(int i,String n,char s)
{
rollno = i;
name = n;
section = s;
}
StudentId(int i,String n,char s,String m)
{
rollno = i;
name = n;
section = s;
address = m;
}
//Method to display the values 
void display(){System.out.println(rollno+" "+name+" "+section+" "+address);}
public static void main(String args[]){
StudentId s1 = new StudentId(1, "Rahul",'A');
StudentId s2 = new StudentId(2, "Yash",'B',"Kanpur");
s1.display();
s2.display();
}
}